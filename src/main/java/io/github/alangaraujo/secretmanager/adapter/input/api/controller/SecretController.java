package io.github.alangaraujo.secretmanager.adapter.input.api.controller;

import io.github.alangaraujo.secretmanager.adapter.input.api.dto.SecretDto;
import io.github.alangaraujo.secretmanager.adapter.input.api.mapper.SecretMapper;
import io.github.alangaraujo.secretmanager.domain.usecase.CreateSecretUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/secrets")
public class SecretController {

    private final CreateSecretUseCase createSecretUseCase;
    private final SecretMapper secretMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody SecretDto secretDto) {
        createSecretUseCase.create(secretMapper.toDomain(secretDto));
    }
}
