package dominio;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "partidos")
public class Partido {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    Color colorCancha;

    @OneToOne
    Cancha cancha;

    @OneToOne
    //@Column(nullable = true)
    private Reserva reserva;

    public Partido(){

    }

    public Partido(Color colorCancha, Cancha cancha) {
        this.colorCancha = colorCancha;
        this.cancha = cancha;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
