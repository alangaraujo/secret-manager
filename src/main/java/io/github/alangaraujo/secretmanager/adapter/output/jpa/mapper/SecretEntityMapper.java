package io.github.alangaraujo.secretmanager.adapter.output.jpa.mapper;

import io.github.alangaraujo.secretmanager.adapter.output.jpa.model.SecretEntity;
import io.github.alangaraujo.secretmanager.domain.model.Secret;
import org.springframework.stereotype.Component;

@Component
public class SecretEntityMapper {

    public SecretEntity toEntity(Secret secret) {
        return SecretEntity.builder()
                .key(secret.getKey())
                .value(secret.getValue())
                .build();
    }
}
