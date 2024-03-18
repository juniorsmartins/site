package microservice.micropagamentos.adapter.in.consumer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import microservice.micropagamentos.application.core.domain.enums.EEventSource;
import microservice.micropagamentos.application.core.domain.enums.ESagaStatus;

import java.time.OffsetDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class HistoryDtoRequest {

    private EEventSource source;

    private ESagaStatus status;

    private String message;

    private OffsetDateTime createdAt;

}

