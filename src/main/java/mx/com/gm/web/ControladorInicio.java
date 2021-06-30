package mx.com.gm.web;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
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
    
 @Autowired //inyectamos la interface PersonaDAO
 private PersonaDAO personaDAO;
    
    @GetMapping("/")
    public String inicio(Model model){
	List personas= (List) personaDAO.findAll();
	
	log.info("Ejecutando..");
	model.addAttribute("personas", personas);
	return"index";
    }
    
}
