//package com.app.license.licenseRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http
////                .authorizeHttpRequests(authorizeRequests -> authorizeRequests
////                        .requestMatchers("api/generateLicenseKey", "api/validateLicenseKey").permitAll()  // Allow unauthenticated access to these endpoints
////                        .anyRequest().authenticated()
////                )
////                .csrf(csrf -> csrf.disable());  // Disable CSRF for simplicity
//        http.csrf(csrf -> csrf.disable())
//                .authorizeRequests().anyRequest().permitAll();
//
//        return http.build();
//    }
//}
