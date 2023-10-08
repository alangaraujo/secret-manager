package io.github.alangaraujo.secretmanager.domain.usecase;

import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateSecretUseCase {

    private final SecretRepository secretRepository;

    public void update(Secret secret) {
        secretRepository.update(secret);
    }
}
