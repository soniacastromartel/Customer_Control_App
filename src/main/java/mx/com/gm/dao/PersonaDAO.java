package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
public interface PersonaDAO extends JpaRepository<Persona, Long>{
    
    
}
