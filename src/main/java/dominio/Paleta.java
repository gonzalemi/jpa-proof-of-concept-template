package dominio;

import javax.persistence.*;

@Entity
@Table(name = "paletas")
public class Paleta {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Integer grosor; //en mms

    @OneToOne
    private Color color;

    @OneToOne
    private Constructor constructor;

    public Paleta(){

    }

    public Paleta(String nombre, Integer grosor, Color color, Constructor constructor) {
        this.nombre = nombre;
        this.grosor = grosor;
        this.color = color;
        this.constructor = constructor;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
