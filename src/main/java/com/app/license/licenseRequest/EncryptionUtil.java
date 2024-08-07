package com.app.license.licenseRequest;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionUtil {
    private static final String ALGORITHM = "AES";

    public static String encrypt(String rawLicenseKey, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(encryptionKey.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(rawLicenseKey.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static void main(String[] args) {
        try {
            String rawLicenseKey = "Cic@123_";
            String encryptionKey = "1234567891234567";
            String encryptedKey = encrypt(rawLicenseKey, encryptionKey);
            System.out.println("Encrypted License Key: " + encryptedKey);
            String decryptedKey = decrypt(encryptedKey, encryptionKey);
            System.out.println("Decrypted License Key: " + decryptedKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String decrypt(String encryptedData, String key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
}
