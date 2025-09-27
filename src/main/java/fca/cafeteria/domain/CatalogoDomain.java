package fca.cafeteria.domain;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.CatalogoRepository;
import fca.cafeteria.data.TipoBebida;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CatalogoDomain {

    @Autowired
    private CatalogoRepository catalogoRepository;

    //Registra una bebida y su tipo si no existe, si ya existe su tipo lo asocia a la bebida agregada
    public boolean registrarBebida(Bebida bebida, TipoBebida tipoBebida) {
        //si el tipoBebida existe
        if (catalogoRepository.existeTipoBebida(tipoBebida.getDescripcion())) {
            catalogoRepository.guardarBebida(bebida);
            return true; //Se pasa al CatalogoController
        }
        //si el tipoBebida no existe
        else {
            catalogoRepository.guardarTipo(tipoBebida);
            bebida.setTipoBebida(tipoBebida); //Se asocia el tipo con la bebida
            catalogoRepository.guardarBebida(bebida);
            return false;
        }
    }
}
