//package com.app.license.licenseRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("validate")
//public class LicenseController {
//
//    @Autowired
//    private LicenseService licenseService;
//
//    @PostMapping
//    ResponseEntity<String> validateLicense(@RequestBody LicenseRequest licenseRequest){
//        boolean isValid = licenseService.validateKeys(licenseRequest.getKey1(), licenseRequest.getKey2(), licenseRequest.getKey3());
//        if (isValid) {
//            return ResponseEntity.ok("License is valid.");
//        } else {
//            return ResponseEntity.status(403).body("Invalid license keys.");
//        }
//    }
//}
