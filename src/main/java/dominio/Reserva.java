package dominio;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate inicioPartido;
    private LocalDate finPartido;

    @OneToOne
    private Cancha cancha;

    @OneToOne
    private Jugador responsable;

    public Reserva(){

    }

    public Reserva(LocalDate inicioPartido, LocalDate finPartido, Cancha cancha) {
        this.inicioPartido = inicioPartido;
        this.finPartido = finPartido;
        this.cancha = cancha;
    }

}
