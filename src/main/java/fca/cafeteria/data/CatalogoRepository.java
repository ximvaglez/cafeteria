package fca.cafeteria.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CatalogoRepository {

    @Autowired
    private BebidaRepository bebidaRepository;
    @Autowired
    private TipoBebidaRepository tipoBebidaRepository; //Esto es para inyectar el repositorio para poder registrarlo en la base.

    /*verificar si ya exite el tipoBebida*/
    public boolean existeTipoBebida(String descripcionTipo) {
        return tipoBebidaRepository.findByDescripcionIgnoreCase(descripcionTipo).isPresent();
    }

    public void guardarTipo(TipoBebida tipoBebida) {
        tipoBebidaRepository.save(tipoBebida); /*.save() guarda el objeto en la BD*/
    }

    public void guardarBebida(Bebida bebida) {
        bebidaRepository.save(bebida);
    }
}