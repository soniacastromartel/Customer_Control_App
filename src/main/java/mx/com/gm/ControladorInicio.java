package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
	log.info("Ejecutando..");
	return"Hola Mundo Spring";
    }
    
}
