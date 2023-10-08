package io.github.alangaraujo.secretmanager.domain.usecase.port;

import io.github.alangaraujo.secretmanager.domain.model.Secret;

public interface SecretRepository {

    void update(Secret secret);
    void create(Secret secret);
    void delete(String key);

}
