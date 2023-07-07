package br.edu.ifpb.gugawag.api.service;

import br.edu.ifpb.gugawag.api.model.Paciente;
import br.edu.ifpb.gugawag.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService   {

    @Autowired
    private PacienteRepository pacienteRepositorio;


    public List<Paciente> getPacientes() {
        return pacienteRepositorio.findAll();
    }


    public Paciente addPaciente(Paciente paciente) {
        return pacienteRepositorio.save(paciente);
    }


    public Paciente getPaciente(Integer id) {
        return pacienteRepositorio.findById(id).orElse(new Paciente());
    }


    public Boolean removerPaciente(Integer id) {
        Paciente paciente = this.getPaciente(id);
        try{
            pacienteRepositorio.delete(paciente);
        }catch (Exception e){
            return false;
        }
        return true;

    }


    public Paciente atualizarPaciente(Paciente paciente) {

        return pacienteRepositorio.save(paciente);
    }
}
