package com.app.license.licenseRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LicenseKeyService {

    @Value("${encryption.key}")
    private String encryptionKey;

    @Value("${validation.key1}")
    private String validationKey1;

    @Value("${validation.key2}")
    private String validationKey2;

    @Value("${validation.key3}")
    private String validationKey3;

    @Autowired
    private LicenseKeyRepository licenseKeyRepository;

    public String generateAndSaveLicenseKey(String rawLicenseKey) throws Exception {
        String encryptedKey = EncryptionUtil.encrypt(rawLicenseKey, encryptionKey);
        LicenseKey licenseKey = new LicenseKey();
        licenseKey.setRawKey(rawLicenseKey);
        licenseKey.setEncryptedKey(encryptedKey);
        licenseKeyRepository.save(licenseKey);
        return encryptedKey;
    }

    public boolean validateLicenseKey(String rawLicenseKey, String accessKey1, String accessKey2, String accessKey3) {
        try {
            LicenseKey storedLicenseKey = licenseKeyRepository.findByRawKey(rawLicenseKey);
            if (storedLicenseKey == null) {
                return false;
            }
            String decryptedLicenseKey = EncryptionUtil.decrypt(storedLicenseKey.getEncryptedKey(), encryptionKey);
            if (decryptedLicenseKey.equals(storedLicenseKey.getRawKey())){
                return validationKey1.equals(accessKey1) && validationKey2.equals(accessKey2) && validationKey3.equals(accessKey3);
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
