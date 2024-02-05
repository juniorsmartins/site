package microservice.microtimes.adapter.in.dto;

import microservice.microtimes.adapter.in.dto.enums.ESagaStatus;

import java.time.Instant;
import java.util.List;

public final class Event {

    private Long id;

    private Long transactionId;

    private Inscrito payload;

    private String source;

    private ESagaStatus status;

    private List<History> eventHistories;

    private Instant createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Inscrito getPayload() {
        return payload;
    }

    public void setPayload(Inscrito payload) {
        this.payload = payload;
    }

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

    public List<History> getEventHistories() {
        return eventHistories;
    }

    public void setEventHistories(List<History> eventHistories) {
        this.eventHistories = eventHistories;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
