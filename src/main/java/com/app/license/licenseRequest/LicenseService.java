//package com.app.license.licenseRequest;
//
//import org.springframework.stereotype.Service;
//
//import static com.app.license.licenseRequest.LicenseConfiguration.*;
//
//@Service
//public class LicenseService {
//    public boolean validateKeys(String encryptedKey1, String encryptedKey2, String encryptedKey3){
//        try{
//            String key1 = CryptoUtil.decrypt(encryptedKey1, LicenseConfiguration.ENCRYPTION_KEY);
//            String key2 = CryptoUtil.decrypt(encryptedKey2, LicenseConfiguration.ENCRYPTION_KEY);
//            String key3 = CryptoUtil.decrypt(encryptedKey3, LicenseConfiguration.ENCRYPTION_KEY);
//
//            if (validateKey1.equals(key1) && validateKey2.equals(key2) && validateKey3.equals(key3)){
//                    return true;
//            }else{
//                return false;
//            }
//        } catch (Exception e){
//            return false;
//        }
//    }
//}
