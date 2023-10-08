package io.github.alangaraujo.secretmanager.adapter.output.repository;

import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class LogSecretRepository implements SecretRepository {

    @Override
    public void update(Secret secret) {

    }

    @Override
    public void create(Secret secret) {
        log.info("Creating secret '{}' with value '{}'", secret.getKey(), secret.getValue());
    }

    @Override
    public void delete(String key) {

    }
}
