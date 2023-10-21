package cl.awakelab.certificacionpa.repository;

import cl.awakelab.certificacionpa.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer > {
}
