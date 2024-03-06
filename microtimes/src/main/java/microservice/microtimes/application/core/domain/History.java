package microservice.microtimes.application.core.domain;

import microservice.microtimes.application.core.domain.enums.ESagaStatus;

import java.time.OffsetDateTime;

public final class History {

    private String source;

    private ESagaStatus status;

    private String message;

    private OffsetDateTime createdAt;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ESagaStatus getStatus() {
        return status;
    }

    public void setStatus(ESagaStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

