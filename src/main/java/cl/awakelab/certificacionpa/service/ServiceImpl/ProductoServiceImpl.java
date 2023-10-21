package cl.awakelab.certificacionpa.service.ServiceImpl;

import cl.awakelab.certificacionpa.entity.Producto;
import cl.awakelab.certificacionpa.repository.IProductoRepository;
import cl.awakelab.certificacionpa.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productoServiceImpl")
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    IProductoRepository objProductoRepo;

    @Override
    public List<Producto> listarProductos() {
        List<Producto> listarProductos = new ArrayList<>();
        listarProductos = objProductoRepo.findAll();
        return listarProductos;
    }

    @Override
    public Producto listarProductoId(int id) {
        return objProductoRepo.findById(id).orElse(null);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        Producto nuevoProducto = new Producto();
        nuevoProducto = objProductoRepo.save(producto);
        return nuevoProducto;
    }

    @Override
    public Producto actualizarProducto(int id, Producto productoActualizado) {
        Producto productoParaActualizar = objProductoRepo.findById(id).orElse(null);
        productoParaActualizar.setNombre(productoActualizado.getNombre());
        productoParaActualizar.setPrecio(productoActualizado.getPrecio());
        return objProductoRepo.save(productoActualizado);
    }

    @Override
    public void eliminarProducto(int id) {
        objProductoRepo.deleteById(id);
    }
}
