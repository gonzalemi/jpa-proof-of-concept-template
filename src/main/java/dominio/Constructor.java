package dominio;

import javax.persistence.*;

@Entity
@Table(name = "constructores")
public class Constructor {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String domicilio;

    public Constructor(){

    }

    public Constructor(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

}
