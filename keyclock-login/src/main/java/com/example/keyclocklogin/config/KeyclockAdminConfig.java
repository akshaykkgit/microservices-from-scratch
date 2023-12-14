package com.example.keyclocklogin.config;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.beans.factory.annotation.Value;

public class KeyclockAdminConfig {
    @Value("${keycloak.serverUrl}")
    private String SERVER_URL;

    @Value("${keycloak.realm}")
    private String REALM;

    @Value("${keycloak.username}")
    private String USERNAME;

    @Value("${keycloak.password}")
    private String PASSWORD;

    @Value("${keycloak.clientId}")
    private String CLIENT_ID;

    private Keycloak getInstance() {
        return KeycloakBuilder
                .builder()
                .serverUrl(SERVER_URL)
                .realm("master")
                .username(USERNAME)
                .password(PASSWORD)
                .clientId(CLIENT_ID)
                .build();
    }

}
