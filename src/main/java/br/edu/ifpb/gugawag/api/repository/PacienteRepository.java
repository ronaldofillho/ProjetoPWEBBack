package br.edu.ifpb.gugawag.api.repository;

import br.edu.ifpb.gugawag.api.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
}
