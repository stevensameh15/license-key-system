package com.app.license.licenseRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class LicenseKeyController {

    @Autowired
    private LicenseKeyService licenseKeyService;

    @PostMapping("/generateLicenseKey")
    public String generateLicenseKey(@RequestParam String rawLicenseKey) throws Exception {
        return licenseKeyService.generateAndSaveLicenseKey(rawLicenseKey);
    }

    @GetMapping("/validateLicenseKey")
    public ResponseEntity<String> validateLicenseKey(@RequestParam String rawLicenseKey,
                                                     @RequestParam String accessKey1,
                                                     @RequestParam String accessKey2,
                                                     @RequestParam String accessKey3) {
        try {
            boolean isValid = licenseKeyService.validateLicenseKey(rawLicenseKey, accessKey1, accessKey2, accessKey3);
            if (isValid){
                return ResponseEntity.ok("License key is valid.");
            }else{
                throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Invalid license key or access keys.");
            }
        }catch (ResponseStatusException e){
            throw e;
        }
    }
}