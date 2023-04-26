package com.pawga.oauthdemo01.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

/**
 * Created by sivannikov on 26.04.2023 20:23
 */

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    @Throws(Exception::class)
    fun securityFilterChain(httpSecurity: HttpSecurity): SecurityFilterChain {
        httpSecurity.authorizeHttpRequests()
                .requestMatchers("/public").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
        return httpSecurity.build()
    }
}

