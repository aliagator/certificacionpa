package cl.awakelab.certificacionpa.service;

import cl.awakelab.certificacionpa.entity.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> listarProductos();

    Producto listarProductoId(int id);

    Producto crearProducto(Producto producto);

    Producto actualizarProducto(int id, Producto productoActualizado);

    void eliminarProducto(int id);
}
