package microservice.microtimes.adapter.out;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import microservice.microtimes.adapter.out.repository.TimeRepository;
import microservice.microtimes.adapter.out.repository.mapper.TimeEntityMapper;
import microservice.microtimes.application.core.domain.Time;
import microservice.microtimes.application.port.output.TimeSaveOutputPort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class TimeSaveAdapter implements TimeSaveOutputPort {

    private final TimeRepository timeRepository;

    private final TimeEntityMapper timeEntityMapper;

    @Transactional
    @Override
    public Time save(Time time) {

        log.info("Iniciado adaptador para salvar Time.");

        var timeSave = Optional.ofNullable(time)
            .map(this.timeEntityMapper::toTimeEntity)
            .map(this.timeRepository::save)
            .map(this.timeEntityMapper::toTime)
            .orElseThrow();

        log.info("Finalizado adaptador para salvar Time, com nome fantasia: {}.", timeSave.getNomeFantasia());

        return timeSave;
    }
}

