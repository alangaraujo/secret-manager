package io.github.alangaraujo.secretmanager.adapter.output.jpa.repository;

import io.github.alangaraujo.secretmanager.adapter.output.jpa.model.SecretEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretEntityRepository extends JpaRepository<SecretEntity, String> {
}
