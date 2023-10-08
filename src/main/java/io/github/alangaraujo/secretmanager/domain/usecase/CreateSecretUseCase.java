package io.github.alangaraujo.secretmanager.domain.usecase;

import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateSecretUseCase {

    private final SecretRepository secretRepository;

    public void create(Secret secret) {
        secretRepository.create(secret);
    }
}
