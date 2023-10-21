package cl.awakelab.certificacionpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long categoriaId;

    @Column(name = "nombre_categoria", nullable = false)
    private String nombreCategoria;

}
