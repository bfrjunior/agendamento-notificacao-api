package com.fernandorocha.agendamento_notificacao_api.business.mapper;

import com.fernandorocha.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.fernandorocha.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.fernandorocha.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
