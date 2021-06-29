package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
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
//	model.addAttribute("personas", personas);
	return"index";
    }
    
}
