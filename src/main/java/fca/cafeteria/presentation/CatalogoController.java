package fca.cafeteria.presentation;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.domain.CatalogoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatalogoController {

    @Autowired
    private CatalogoDomain catalogoDomain;

    @RequestMapping(value = "/bebida", method = RequestMethod.POST)
    @ResponseBody
    public String registrarBebida(@RequestBody Bebida bebida) {
        boolean tipoExistente = catalogoDomain.registrarBebida(bebida, bebida.getTipoBebida());

        //Si es true o false el boolean se devuelve un mensaje diferente
        if (tipoExistente) {
            return "Bebida registrada con tipo existente.";
        } else {
            return "Bebida Agregada.";
        }
    }
}