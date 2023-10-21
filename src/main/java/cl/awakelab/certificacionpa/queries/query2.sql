#Consulta 2
#Se solicita una lista del Nombre y el total gastado de todos los clientes que han realizado compras superiores a $1000.
# Prueba Pablo Aliaga

SELECT C.nombre, SUM(CO.total) AS total_gastado
FROM Cliente AS C
         JOIN Compra AS CO ON C.cliente_id = CO.cliente_id
GROUP BY C.nombre
HAVING SUM(CO.total) > 1000;