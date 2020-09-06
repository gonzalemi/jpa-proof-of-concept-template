package dominio;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "canchas")
public class Cancha {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Boolean estaIluminada;

    @OneToOne
    private Color color;

    public Cancha(String nombre, Boolean estaIluminada, Color color) {
        this.nombre = nombre;
        this.estaIluminada = estaIluminada;
        this.color = color;
    }

}
