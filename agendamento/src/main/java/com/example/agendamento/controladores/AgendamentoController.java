package com.example.agendamento.controladores;

import com.example.agendamento.entidades.Agendamento;
import com.example.agendamento.repositorios.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository repositorios;

    @GetMapping
    public List<Agendamento> listaAgendamentos() {
        return (List<Agendamento>) repositorios.findAll();
    }

    @PostMapping
    public ResponseEntity<?> criarAgendamento(@RequestBody Agendamento agendamento) {
        Agendamento salvo = repositorios.save(agendamento);
        return ResponseEntity.ok(salvo);
    }

    @PutMapping
    public Agendamento editarAgendamento(@RequestBody Agendamento agendamento) {
        Agendamento novoAgendamento = repositorios.save(agendamento);
        return novoAgendamento;
    }

    @DeleteMapping("/{id}")
    public Optional<Agendamento> excluirAgendamento(@PathVariable Long id){
        Optional<Agendamento> agendamento = repositorios.findById(id);
        repositorios.deleteById(id);
        return agendamento;
    }

}