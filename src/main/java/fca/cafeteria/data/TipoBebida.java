package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "ttipobebida")
@Getter
@Setter
public class TipoBebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descripcion;

    // Relación 1:N con Bebida
    @OneToMany(mappedBy = "tipoBebida")
    private List<Bebida> bebidas;
}
