#Consulta 1
# Se solicita mostrar el nombre de cada producto que ha comprado el cliente “Juan Perez”
# Prueba Pablo Aliaga

SELECT P.nombre AS nombre_producto
FROM Cliente AS C
         JOIN Compra AS CO ON C.cliente_id = CO.cliente_id
         JOIN Detalle_Compra AS DC ON CO.compra_id = DC.compra_id
         JOIN Producto AS P ON DC.producto_id = P.producto_id
WHERE C.nombre = 'Juan' AND C.apellido = 'Perez';