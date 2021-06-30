package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
    
}
