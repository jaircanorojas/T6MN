# TEMA 6 METODOS NUMERICOS

 Tabajo realizado en equipo por: Adriana Jamileth Mendoza Ortiz y Jair Cano Rojas

## Metodo de Euler

Condición Inicial: Se proporciona una condición inicial (𝑡0,𝑦0)(t0,y0), donde 𝑡0t0 es el valor inicial del dominio y 𝑦0y0 es el valor inicial de la función.

Tamaño de Paso: Se elige un tamaño de paso ℎh, que determina cuánto se avanza en cada iteración.

Iteración: Se utiliza la siguiente fórmula para calcular 𝑦y en cada paso 𝑛n:

𝑦𝑛+1=𝑦𝑛+ℎ⋅𝑓(𝑡𝑛,𝑦𝑛)yn+1=yn+h⋅f(tn,yn)

Donde:
𝑡𝑛tn es el valor de tiempo en el paso 𝑛n.

𝑦𝑛yn es el valor de la función en el paso 𝑛n.

𝑓(𝑡,𝑦)f(t,y) es la función que define la EDO.

Repetición: Este proceso se repite para tantos pasos como se desee, avanzando desde 𝑡0t0 hasta el tiempo final deseado.

[Ejercicio 1](EjemploEuler.java)

[Ejercicio 2](EjemploEuler2.java)

[Ejercicio 3](EjemploEuler3.java)






