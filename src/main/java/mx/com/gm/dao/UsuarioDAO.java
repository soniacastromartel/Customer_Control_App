package mx.com.gm.dao;

import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */


public interface UsuarioDAO extends JpaRepository<Usuario, Long>{

    Usuario findByUsername(String username);
}
