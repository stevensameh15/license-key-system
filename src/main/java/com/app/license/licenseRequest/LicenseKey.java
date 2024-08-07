package com.app.license.licenseRequest;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "license_key", schema = "license")
public class LicenseKey{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "raw_key")
    private String rawKey;

    @Column(name = "encrypted_key")
    private String encryptedKey;

    public LicenseKey(String key, String encryptedKey) {
        this.rawKey = key;
        this.encryptedKey = encryptedKey;
    }

}

