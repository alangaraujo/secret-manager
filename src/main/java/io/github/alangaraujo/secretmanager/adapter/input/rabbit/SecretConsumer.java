package io.github.alangaraujo.secretmanager.adapter.input.rabbit;

import io.github.alangaraujo.secretmanager.adapter.input.rabbit.dto.SecretDto;
import io.github.alangaraujo.secretmanager.adapter.input.rabbit.mapper.SecretMapper;
import io.github.alangaraujo.secretmanager.domain.usecase.CreateSecretUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecretConsumer {

    private final CreateSecretUseCase createSecretUseCase;
    private final SecretMapper secretMapper;

    @RabbitListener(queues = "secret.create")
    public void listen(SecretDto secretDto) {
        createSecretUseCase.create(secretMapper.toDomain(secretDto));
    }
}
