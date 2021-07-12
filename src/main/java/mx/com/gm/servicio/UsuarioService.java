package mx.com.gm.servicio;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.UsuarioDAO;
import mx.com.gm.domain.Rol;
import mx.com.gm.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */

@Service("userDetailsService")
@Slf4j //para manejar login
public class UsuarioService implements UserDetailsService{
    @Autowired//inyectar instancia
    private UsuarioDAO usuarioDAO;

    @Override
    @Transactional(readOnly = true)//Debe haber transaccion
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Usuario usuario= usuarioDAO.findByUsername(username);

	if (usuario==null) {
	    throw  new UsernameNotFoundException(username);
	    
	}
	ArrayList<GrantedAuthority> roles= new ArrayList<GrantedAuthority>();
	for (Rol rol : usuario.getRoles()) {
	    roles.add(new SimpleGrantedAuthority(rol.getNombre()));
		   
	}
	return  new User(usuario.getUsername(), usuario.getPassword(), roles);
	
    }
    
}
