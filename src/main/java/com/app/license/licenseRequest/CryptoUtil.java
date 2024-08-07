//package com.app.license.licenseRequest;
//
//import javax.crypto.Cipher;
//import javax.crypto.spec.SecretKeySpec;
//import java.util.Base64;
//
//public class CryptoUtil {
//    private static final String ALGORITHM = "AES";
//
//    public static String decrypt(String encryptedText, String encryptionKey) throws Exception{
//        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes(), ALGORITHM);
//        Cipher cipher = Cipher.getInstance(ALGORITHM);
//        cipher.init(Cipher.DECRYPT_MODE, key);
//        byte[] decodedValue = Base64.getDecoder().decode(encryptedText);
//        byte[] decryptedValue = cipher.doFinal(decodedValue);
//        return new String(decryptedValue);
//    }
//}
