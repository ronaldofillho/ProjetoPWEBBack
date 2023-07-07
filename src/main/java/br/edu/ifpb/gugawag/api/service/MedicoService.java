package br.edu.ifpb.gugawag.api.service;

import br.edu.ifpb.gugawag.api.model.Medico;
import br.edu.ifpb.gugawag.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepositorio;

    public List<Medico> getMedicos() {
        return medicoRepositorio.findAll();
    }

    public Medico addMedico(Medico medico) {
        return medicoRepositorio.save(medico);
    }

    public Medico getMedico(Integer id) {
        return medicoRepositorio.findById(id).orElse(new Medico());
    }
    public Boolean removerMedico(Integer id) {
        Medico medico = this.getMedico(id);
        try{
            medicoRepositorio.delete(medico);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public Medico atualizarMedico(Medico medico) {

        return medicoRepositorio.save(medico);
    }
}
