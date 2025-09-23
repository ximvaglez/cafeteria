package fca.cafeteria.data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ttipobebida")
@Getter
@Setter
public class TipoBebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "descripcion")
    private String descripcion;
}

