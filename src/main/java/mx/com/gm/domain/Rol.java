package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
@Entity
@Data //Proyecto Lombok genera los métodos get, set, equals, hashCode y toString
@Table(name = "rol")
public class Rol implements Serializable{
    
   private static final long serialVersionUID= 1L;
   
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idRol;
   
   @NotEmpty
   private String nombre;
   
   
    
}
