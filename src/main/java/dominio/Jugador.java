package db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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


    public Jugador(String nombre, String apellido, String domicilio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }

}
