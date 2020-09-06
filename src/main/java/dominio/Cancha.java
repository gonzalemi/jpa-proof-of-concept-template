package dominio;

import javax.persistence.*;

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

    public Cancha(){

    }

    public Cancha(String nombre, Boolean estaIluminada, Color color) {
        this.nombre = nombre;
        this.estaIluminada = estaIluminada;
        this.setColor(color);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
