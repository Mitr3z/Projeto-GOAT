package com.example.agendamento.repositorios;

import com.example.agendamento.entidades.Agendamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends CrudRepository<Agendamento, Long> {
}
