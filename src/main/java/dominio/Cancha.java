package dominio;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaNacimiento;

    @OneToOne
    private Paleta paleta;

    @OneToMany
    private List<Participacion> participaciones;

    public Jugador(String nombre, String apellido, String domicilio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPaleta(Paleta paleta) {
        this.paleta = paleta;
    }

    public void agregarParticipacion(Partido partido, Paleta paleta) {
        Participacion participacion = new Participacion(this, partido, paleta);
        participaciones.add(participacion);
    }

    public void eliminarParticipacion(Participacion participacion) {
        participaciones.remove(participacion);
    }
}
