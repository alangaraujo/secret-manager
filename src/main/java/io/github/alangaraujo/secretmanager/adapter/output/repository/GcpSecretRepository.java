package io.github.alangaraujo.secretmanager.adapter.output.repository;

import com.google.cloud.secretmanager.v1.*;
import com.google.protobuf.ByteString;
import io.github.alangaraujo.secretmanager.domain.model.Secret;
import io.github.alangaraujo.secretmanager.domain.usecase.port.SecretRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class GcpSecretRepository implements SecretRepository {

    private final SecretManagerServiceClient gcpClient;
    private final String projectId;

    public GcpSecretRepository(SecretManagerServiceClient gcpClient, @Value("${gcp.project-id}") String projectId) {
        this.gcpClient = gcpClient;
        this.projectId = projectId;
    }

    @Override
    public void update(Secret secret) {

    }

    @Override
    public void create(Secret secret) {
        var projectName = ProjectName.of(projectId);
        var gcpSecret = com.google.cloud.secretmanager.v1.Secret.newBuilder()
                .setReplication(Replication.newBuilder()
                        .setAutomatic(Replication.Automatic.newBuilder().build())
                        .build())
                .build();
        gcpClient.createSecret(projectName, secret.getKey(), gcpSecret);
        var secretName = SecretName.of(projectId, secret.getKey());
        var secretPayload = SecretPayload.newBuilder()
                .setData(ByteString.copyFromUtf8(secret.getValue()))
                .build();
        gcpClient.addSecretVersion(secretName, secretPayload);
    }

    @Override
    public void delete(String key) {

    }
}
