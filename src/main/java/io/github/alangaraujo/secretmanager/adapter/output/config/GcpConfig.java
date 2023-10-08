package io.github.alangaraujo.secretmanager.adapter.output.config;

import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GcpConfig {

    @Bean
    public SecretManagerServiceClient secretManagerClient() throws IOException {
        return SecretManagerServiceClient.create();
    }
}
