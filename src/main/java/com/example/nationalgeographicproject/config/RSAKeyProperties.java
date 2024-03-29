package com.example.nationalgeographicproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix ="rsa")
public record RSAKeyProperties(RSAPublicKey publicKey,RSAPrivateKey privateKey) {
}
