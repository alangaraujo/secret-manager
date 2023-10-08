package io.github.alangaraujo.secretmanager.domain.usecase;

import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteSecretUseCase {

    private final SecretRepository secretRepository;

    public void delete(String key) {
        secretRepository.delete(key);
    }
}
