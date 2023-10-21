/*package cl.awakelab.certificacionpa.algorism;

import cl.awakelab.certificacionpa.entity.Producto;

import java.util.List;

public class CalculoComplejo extends Descuento implements CalculoDescuento{
    public static double calcularDescuento(Producto producto) {
        double descuento = 0.0;

        if ("Electrodomésticos".equals(producto.getCategoria())) {
            if (producto.getCantidad() >= 3 && producto.getCantidad() <= 5) {
                descuento = producto.getPrecio() * 0.10; // 10% de descuento
            } else if (producto.getCantidad() >= 6 && producto.getCantidad() <= 10) {
                descuento = producto.getPrecio() * 0.20; // 20% de descuento
            }
        } else if ("Electrónicos".equals(producto.getCategoria())) {
            if (producto.getCantidad() > 5) {
                descuento = producto.getPrecio() * 0.15; // 15% de descuento
            }
        } else if ("Muebles".equals(producto.getCategoria())) {
            if (producto.getCantidad() >= 2 && producto.getCantidad() <= 5) {
                descuento = producto.getPrecio() * 0.20; // 20% de descuento
            } else if (producto.getCantidad() > 5) {
                descuento = producto.getPrecio() * 0.30; // 30% de descuento
            }
        }

        return descuento;
    }
}

 */