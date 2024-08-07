package com.app.license.licenseRequest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseKeyRepository extends JpaRepository<LicenseKey, Integer> {
    LicenseKey findByRawKey(String key);
}
