import dominio.*;
import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        final EntityManager entityManager = PerThreadEntityManagers.getEntityManager();

        final EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Color amarillo = new Color("amarillo");
        entityManager.persist(amarillo);

        Color rojo = new Color("rojo");
        entityManager.persist(rojo);

        Constructor unConstructor = new Constructor("Carlos", "Moliere 476");
        entityManager.persist(unConstructor);

        Paleta paletaPower = new Paleta("paleta power", 5, amarillo, unConstructor);
        entityManager.persist(paletaPower);

        Constructor otroConstructor = new Constructor("Pepe", "Virgilio 123");
        entityManager.persist(otroConstructor);

        Paleta paletaGrande = new Paleta("paleta grande", 7, rojo, otroConstructor);
        entityManager.persist(paletaGrande);

        Cancha cancha = new Cancha("All Boys", true, amarillo);
        entityManager.persist(cancha);

        Partido partido = new Partido(amarillo, cancha);
        entityManager.persist(partido);

        Jugador jugador = new Jugador("Emiliano", "Gonzalez", "Cervantes 607", LocalDate.of(1988, 12, 30));
        jugador.setPaleta(paletaPower);
        entityManager.persist(jugador);

        Participacion participacion = new Participacion(jugador, partido, paletaGrande);
        entityManager.persist(participacion);

        transaction.commit();
        entityManager.close();
    }
}
