package cl.awakelab.certificacionpa.controller;

import cl.awakelab.certificacionpa.entity.Producto;
import cl.awakelab.certificacionpa.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    IProductoService objProductoService;

    @GetMapping
    public String listarProductos(Model model){
        List<Producto> listarProductos = objProductoService.listarProductos();
        model.addAttribute("atributoListarProductos", listarProductos);
        return "templateListarProductos";
    }

    @PostMapping("/crear")
    public String crearProducto(@ModelAttribute Producto producto, Model model){
        List<Producto>listarProductos = objProductoService.listarProductos();
        model.addAttribute("atributoListarProductos", listarProductos);
        objProductoService.crearProducto(producto);
        return "redirect:/productos";
    }

    @PostMapping("editar/{id}")
    public String actualizarProducto(@PathVariable int id, @ModelAttribute Producto producto){
        objProductoService.actualizarProducto(id, producto);
        return "redirect:/productos";
    }

    @PostMapping("eliminar/{id}")
    public String eliminarPrducto(@PathVariable int id){
        objProductoService.eliminarProducto(id);
        return "redirect:/productos";
    }

}
