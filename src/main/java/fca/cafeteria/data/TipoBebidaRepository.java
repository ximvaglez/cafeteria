package fca.cafeteria.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*Aquí se manejan los tipos de bebida, como café,té, latte, etc.*/
public interface TipoBebidaRepository extends JpaRepository<TipoBebida, Integer> {
    Optional<TipoBebida> findByDescripcionIgnoreCase(String nombre); /*Se busca por la descripción del tipoBebida
    y verifica si el ya existe la descripcion*/
}
