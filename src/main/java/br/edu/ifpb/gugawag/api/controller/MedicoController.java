package br.edu.ifpb.gugawag.api.controller;
import br.edu.ifpb.gugawag.api.model.Medico;
import br.edu.ifpb.gugawag.api.service.MedicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping("/medicos")
    public List<Medico> getMedicos(){
        return this.medicoService.getMedicos();
    }

    @GetMapping("/medicos/{id}")
    public Medico getMedicoPorId(@PathVariable("id") Integer idMedico) {
        return this.medicoService.getMedico(idMedico);
    }

    @PostMapping("/medicos")
    public Medico inserirMedico(@RequestBody Medico MedicoAInserir) {
        return this.medicoService.addMedico(MedicoAInserir);
    }

    @PutMapping("/medicos/{id}")
    public Medico atualizarMedico(@RequestBody Medico MedicoAtualizar) {
        return this.medicoService.atualizarMedico(MedicoAtualizar);
    }

    @DeleteMapping("/medicos/{id}")
    public void apagarMedico(@PathVariable("id") Integer id) {
        this.medicoService.removerMedico(id);
    }

}
