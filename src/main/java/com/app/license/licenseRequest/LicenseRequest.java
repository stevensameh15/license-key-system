//package com.app.license.licenseRequest;
//
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "license_request", schema = "license")
//public class LicenseRequest {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "key1")
//    private String key1 ;
//
//    @Column(name = "key2")
//    private String key2 ;
//
//    @Column(name = "key3")
//    private String key3 ;
//
//
//
//    @JsonCreator
//    public LicenseRequest(@JsonProperty("key1") String key1,
//                          @JsonProperty("key2") String key2,
//                          @JsonProperty("key3") String key3) {
//        this.key1 = key1;
//        this.key2 = key2;
//        this.key3 = key3;
//    }
//}
