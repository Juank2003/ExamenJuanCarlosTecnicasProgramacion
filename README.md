# ExamenJuanCarlosTecnicasProgramacion
## Mi repositorio: https://github.com/Juank2003/ExamenJuanCarlosTecnicasProgramacion.git
## Práctica 1. Obtención de una aproximación al
número pi
Implemente un programa que permita obtener una aproximación al número
pi mediante el método de Montecarlo1
. Se propone el siguiente pseudocódigo
(tenga en cuenta que el radio del círculo elegido es 1):
Algoritmo 1: Aproximación a pi mediante Montecarlo
Input: puntosT otales: cantidad de puntos a generar
Output: Número real que es una aproximación al número pi
aciertos ← 0;
areaCuadrado ← 4;
for i ← 1 to puntosT otales do
Obtener un número aleatorio x entre -1 y 1;
Obtener un número aleatorio y entre -1 y 1;
if d((x, y),(0, 0)) ≤ 1 then aciertos ← aciertos + 1;
end
return areaCuadrado · (aciertos/puntosT otales) ;
##  Práctica 2. El juego de la vida
Implemente una versión del juego de la vida2
con las siguientes características:
1. Las reglas son las habituales:
a) Si una célula está viva y dos o tres de sus vecinas también lo están,
entonces continúa viva en el estado siguiente.
b) Si una célula está muerta y tres de sus vecinas están vivas, entonces pasa a estar viva en el estado siguiente.
c) El resto de células pasan a estar muertas en el estado siguiente.
2. Asuma un tablero con 30 celdas (células).
3. El estado inicial del tablero estará almacenado en un fichero (llamado
matriz) con 30 filas y 30 columnas en que cada celda será un uno o un
cero
##  Práctica 3. Búsqueda de un camino en un grafo
Implemente, siguiendo un desarrollo dirigido por pruebas, una estructura de
datos de grafo según el siguiente esquema:
Para implementar el método onePath() puede seguir el siguiente pseudocódigo:
Algoritmo 2: Búsqueda de un camino entre dos vértices
Input: El vértice de inicio v1 y el vértice de fin v2
Output: Secuencia de vértices desde v1 hasta v2 a través de arcos
del grafo
Cree una tabla llamada traza;
Cree una pila llamada abierta;
abierta.push(v1);
traza.annadir(v1, null);
encontrado ← f also;
while ¬abierta.esV acia() ∧ ¬encontrado do
v ← abierta.pop();
encontrado pasa a ser verdadero si v es igual a v2;
if ¬encontrado then
for s ∈ adyacentes(v) do
abierta.push(s);
traza.annadir(s, v);
end
end
end
if encontrado then
Reconstruir el camino que hay en traza y devolverlo
else
Devolver un indicador (por ejemplo, null) de que no se ha
encontrado el camino
end
La traza almacena los nudos que se van encontrando en la exploración
