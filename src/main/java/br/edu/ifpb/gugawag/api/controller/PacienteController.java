package br.edu.ifpb.gugawag.api.controller;
import br.edu.ifpb.gugawag.api.model.Paciente;
import br.edu.ifpb.gugawag.api.service.PacienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes(){
        return this.pacienteService.getPacientes();
    }

    @GetMapping("/pacientes/{id}")
    public Paciente getPacientePorId(@PathVariable("id") Integer idPaciente) {
        return this.pacienteService.getPaciente(idPaciente);
    }

    @PostMapping("/pacientes")
    public Paciente inserirPaciente(@RequestBody Paciente PacienteAInserir) {
        return this.pacienteService.addPaciente(PacienteAInserir);
    }

    @PutMapping("/pacientes/{id}")
    public Paciente atualizarPaciente(@RequestBody Paciente PacienteAtualizar) {
        return this.pacienteService.atualizarPaciente(PacienteAtualizar);
    }

    @DeleteMapping("/pacientes/{id}")
    public void apagarPaciente(@PathVariable("id") Integer id) {
        this.pacienteService.removerPaciente(id);
    }

}
