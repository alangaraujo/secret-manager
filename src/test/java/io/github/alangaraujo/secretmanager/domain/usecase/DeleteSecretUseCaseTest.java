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
public class DeleteSecretUseCaseTest {

    @InjectMocks
    private DeleteSecretUseCase deleteSecretUseCase;

    @Mock
    private SecretRepository secretRepository;

    @Test
    public void givenASecretWhenDeleteThenCallRepository() {
        var key = "key";
        deleteSecretUseCase.delete(key);
        verify(secretRepository).delete(key);
    }
}
