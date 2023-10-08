package io.github.alangaraujo.secretmanager.adapter.output.repository;

import io.github.alangaraujo.secretmanager.adapter.output.jpa.mapper.SecretEntityMapper;
import io.github.alangaraujo.secretmanager.adapter.output.jpa.repository.SecretEntityRepository;
import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
@RequiredArgsConstructor
public class JpaSecretRepository implements SecretRepository {

    private final SecretEntityRepository secretEntityRepository;
    private final SecretEntityMapper secretEntityMapper;

    @Override
    public void update(Secret secret) {

    }

    @Override
    public void create(Secret secret) {
        secretEntityRepository.save(secretEntityMapper.toEntity(secret));
    }

    @Override
    public void delete(String key) {

    }
}
