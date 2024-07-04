package uni.isw.sigconbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uni.isw.sigconbackend.model.Solicitante;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Long> {
    Solicitante findByPersona_Ndocumento(String ndocumento);
}