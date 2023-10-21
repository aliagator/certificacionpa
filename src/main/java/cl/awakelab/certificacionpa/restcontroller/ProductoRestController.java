package cl.awakelab.certificacionpa.restcontroller;

import cl.awakelab.certificacionpa.entity.Producto;
import cl.awakelab.certificacionpa.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {
@Autowired
IProductoService objproductoService; // Inyecta el servicio correspondiente
    @Autowired
    IProductoService objProductoService;

    @GetMapping
    public List<Producto> listarProductos(){
        return objProductoService.listarProductos();
    }

    @GetMapping("/{id}")
    public Producto listarProductoId(@PathVariable int id){
        return objProductoService.listarProductoId(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto productoNuevo){
        return objProductoService.crearProducto(productoNuevo);
    }

    @PutMapping("{id}")
    public Producto actualizarProducto(@PathVariable int id, @RequestBody Producto producto){
        return objProductoService.actualizarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id){
        objProductoService.eliminarProducto(id);
    }

}
