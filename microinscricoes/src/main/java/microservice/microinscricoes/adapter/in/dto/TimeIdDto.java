package microservice.microinscricoes.adapter.in.dto;

import jakarta.validation.constraints.Positive;

public record TimeIdDto(@Positive Long id) { }

