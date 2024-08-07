//package com.app.license.licenseRequest;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LicenseKeyGenerator {
//
//    @Value("${encryption.key}")
//    private String encryptionKey;
//
//    public String generateEncryptedLicenseKey(String rawLicenseKey) throws Exception {
//        return EncryptionUtil.encrypt(rawLicenseKey, encryptionKey);
//    }
//}
