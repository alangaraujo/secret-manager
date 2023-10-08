package io.github.alangaraujo.secretmanager.adapter.input.rabbit.mapper;

import io.github.alangaraujo.secretmanager.adapter.input.rabbit.dto.SecretDto;
import io.github.alangaraujo.secretmanager.domain.model.Secret;
import org.springframework.stereotype.Component;

@Component("secretMapperRabbit")
public class SecretMapper {

    public Secret toDomain(SecretDto secretDto) {

        return Secret.builder()
                .key(secretDto.getKey())
                .value(secretDto.getValue())
                .build();
    }
}
