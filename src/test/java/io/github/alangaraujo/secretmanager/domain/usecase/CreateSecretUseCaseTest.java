package io.github.alangaraujo.secretmanager.domain.usecase;

import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CreateSecretUseCaseTest {

    @InjectMocks
    private CreateSecretUseCase createSecretUseCase;

    @Mock
    private SecretRepository secretRepository;

    @Test
    public void givenASecretWhenCreateThenCallRepository() {
        var secret = Secret.builder().build();
        createSecretUseCase.create(secret);
        verify(secretRepository).create(secret);
    }
}
