package fca.cafeteria.data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

    @Entity
    @Table(name = "tbebida")
    public class Bebida{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Getter
        @Setter
        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Getter
        @Setter
        @Column(name = "descripcion", nullable = false)
        private String descripcion;

}
