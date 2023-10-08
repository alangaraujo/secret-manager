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
public class UpdateSecretUseCaseTest {

    @InjectMocks
    private UpdateSecretUseCase updateSecretUseCase;

    @Mock
    private SecretRepository secretRepository;

    @Test
    public void givenASecretWhenUpdateThenCallRepository() {
        var secret = Secret.builder().build();
        updateSecretUseCase.update(secret);
        verify(secretRepository).update(secret);
    }
}
