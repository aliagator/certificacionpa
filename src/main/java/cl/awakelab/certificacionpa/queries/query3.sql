#Consulta 3
#Se solicita una lista con las categorías más vendidas y la cantidad total de productos vendidos, ordenados de forma descendente.
# Prueba Pablo Aliaga

SELECT C.nombre_categoria, SUM(DC.cantidad) AS cantidad_total_vendida
FROM Categoria AS C
         JOIN Producto AS P ON C.categoria_id = P.categoria_id
         JOIN Detalle_Compra AS DC ON P.producto_id = DC.producto_id
GROUP BY C.nombre_categoria
ORDER BY cantidad_total_vendida DESC;