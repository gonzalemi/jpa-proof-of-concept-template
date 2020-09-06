package dominio;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "participaciones")
public class Participacion {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Jugador jugador;
    @OneToOne
    private Partido partido;
    @OneToOne
    private Paleta paleta;

    public Participacion(){

    }

    public Participacion(Jugador jugador, Partido partido, Paleta paleta) {
        this.jugador = jugador;
        this.partido = partido;
        this.paleta = paleta;
    }

}
