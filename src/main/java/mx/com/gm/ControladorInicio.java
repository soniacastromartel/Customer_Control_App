package mx.com.gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
@RestController
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
	return"Hola Mundo Spring";
    }
    
}
