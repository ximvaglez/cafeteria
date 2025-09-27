package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "tbebida")
@Getter
@Setter
public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    // FK hacia TipoBebida
    @ManyToOne
    @JoinColumn(name = "idtipobebida", nullable = false)
    private TipoBebida tipoBebida;

    // Relación con la tabla intermedia
    @OneToMany(mappedBy = "bebida")
    private List<BebidaIngrediente> ingredientes;
}
