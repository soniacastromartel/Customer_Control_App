package mx.com.gm;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model){
	log.info("Ejecutando..");
	String mensaje= "Hola Mundo";
	
	Persona persona= new Persona();
	persona.setNombre("Luis");
	persona.setApellido("Lopez");
	persona.setEmail("llop@mail.com");
	persona.setTelefono("000000000");
	
	Persona persona2= new Persona();
	persona2.setNombre("Emma");
	persona2.setApellido("Cardoso");
	persona2.setEmail("ecar@mail.com");
	persona2.setTelefono("987654321");
	
	List personas= new ArrayList();
	personas.add(persona);
	personas.add(persona2);
	
	model.addAttribute("mensaje", mensaje);
	model.addAttribute("persona", persona);
	model.addAttribute("personas", personas);
	return"index";
    }
    
}
