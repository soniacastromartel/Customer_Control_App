package mx.com.gm.domain;

import lombok.Data;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
//Usamos la notación de Lombok para evitar el boiler plate code
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    
}
