# Consulta 5
# Se solicita una lista que muestre el monto que ha gastado cada cliente en la categoría “Electrodomésticos”.
# Prueba Pablo Aliaga

SELECT C.nombre, C.apellido, SUM(DC.subtotal) AS monto_gastado
FROM Cliente AS C
         JOIN Compra AS CO ON C.cliente_id = CO.cliente_id
         JOIN Detalle_Compra AS DC ON CO.compra_id = DC.compra_id
         JOIN Producto AS P ON DC.producto_id = P.producto_id
         JOIN Categoria AS CA ON P.categoria_id = CA.categoria_id
WHERE CA.nombre_categoria = 'Electrodomésticos'
GROUP BY C.nombre, C.apellido
ORDER BY monto_gastado DESC;