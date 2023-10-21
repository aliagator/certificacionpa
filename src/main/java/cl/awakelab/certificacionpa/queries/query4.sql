# Consulta 4
# Se solicita una lista que muestre los productos ( nombre y precio), de aquellos que no han sido vendidos nunca, ordenados por precio de forma ascendente.
# Prueba Pablo Aliaga

SELECT P.nombre, P.precio
FROM Producto AS P
         LEFT JOIN Detalle_Compra AS DC ON P.producto_id = DC.producto_id
WHERE DC.detalle_id IS NULL
ORDER BY P.precio ASC;