package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colores")
public class Color {

    @Id
    @GeneratedValue
    private Long id;

    private String descripcion;

    public Color(){

    }

    public Color(String descripcion) {
        this.descripcion = descripcion;
    }

}
