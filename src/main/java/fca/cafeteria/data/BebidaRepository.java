package fca.cafeteria.data;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/*Bebida*/
public interface BebidaRepository extends JpaRepository<Bebida, Integer> {
    Optional<Bebida> findByNombreIgnoreCase(String nombre); /*Busca la bebida por nombre y
    devuelve Optional si no se encuentra nada*/
}
