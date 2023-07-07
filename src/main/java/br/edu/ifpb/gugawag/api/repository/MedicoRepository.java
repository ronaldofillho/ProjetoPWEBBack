package br.edu.ifpb.gugawag.api.repository;

import br.edu.ifpb.gugawag.api.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Integer> {
}