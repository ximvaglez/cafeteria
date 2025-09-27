package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbebidaingrediente")
@Getter
@Setter
public class BebidaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebidaIngrediente;

    // FK hacia Bebida
    @ManyToOne
    @JoinColumn(name = "idbebida", nullable = false)
    private Bebida bebida;

    // FK hacia Ingrediente
    @ManyToOne
    @JoinColumn(name = "idingrediente", nullable = false)
    private Ingrediente ingrediente;

    @Column(nullable = false)
    private int cantidad;
}
