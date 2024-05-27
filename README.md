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

[![300px-Aplicaci-n-del-m-todo-de-Euler.jpg](https://i.postimg.cc/wBRkhZNF/300px-Aplicaci-n-del-m-todo-de-Euler.jpg)](https://postimg.cc/yJB9KfvS)

[Ejercicio 1](EjemploEuler.java)

[Ejercicio 2](EjemploEuler2.java)

[Ejercicio 3](EjemploEuler3.java)

[Ejercicio 4](EjemploEuler4.java)

## Metodo de Runge-Kutta

El método de Runge-Kutta de pasos múltiples, a menudo conocido como el método de Runge-Kutta de orden superior, es una técnica popular en métodos numéricos para resolver ecuaciones diferenciales ordinarias (EDOs). Estos métodos son valiosos por su precisión y eficiencia al abordar problemas que no se pueden resolver analíticamente.
Los métodos de Runge-Kutta de orden 𝑛n proporcionan una aproximación de la solución de una EDO de la forma:

y′=f(t,y),y(t0)=y0
a través de una combinación lineal de evaluaciones de la función 𝑓 (𝑡, 𝑦) f (t, y) en varios puntos dentro del intervalo de integración.

[Ejercicio 1](EjercicioRK1.java)

[Ejercicio 2](EjercicioRK2.java)

[Ejercicio 3](EjercicioRK3.java)

[Ejercicio 4](EjercicioRK4.java)

## Metodo de Taylor

El método de Taylor es una técnica numérica para resolver ecuaciones diferenciales ordinarias (EDOs) basada en la expansión en serie de Taylor de la solución de la ecuación. Este método utiliza la serie de Taylor para aproximar la solución de la EDO en intervalos pequeños, proporcionando una forma sistemática de estimar el valor de la función en puntos sucesivos a partir de su valor en un punto inicial.

Concepto Básico

Dada una EDO de primer orden:
𝑑𝑦/𝑑𝑡=𝑓(𝑡,𝑦)dtdy=f(t,y)

y una condición inicial 𝑦(𝑡0)=𝑦0y(t0)=y0, el método de Taylor aproxima la solución en un punto 𝑡1=𝑡0+ℎt1=t0+h usando la serie de Taylor truncada de 𝑦(𝑡)y(t) alrededor de 𝑡0t0:

𝑦(𝑡)=𝑦(𝑡0)+𝑦′(𝑡0)(𝑡−𝑡0)+𝑦′′(𝑡0)2!(𝑡−𝑡0)2+𝑦′′′(𝑡0)3!(𝑡−𝑡0)3+⋯y(t)=y(t0)+y′(t0)(t−t0)+2!y′′(t0)(t−t0)2+3!y′′′(t0)(t−t0)3+⋯

Al truncar la serie después de un número finito de términos, se obtiene una aproximación de la solución. Por ejemplo, utilizando hasta la segunda derivada, la fórmula sería:

𝑦(𝑡1)≈𝑦(𝑡0)+𝑦′(𝑡0)ℎ+𝑦′′(𝑡0)2!ℎ2y(t1)≈y(t0)+y′(t0)h+2!y′′(t0)h2

[Ejercicio 1](EjercicioTay1.java)

[Ejercicio 2](EjercicioTay2.java)

[Ejercicio 3](EjercicioTay3.java)

[Ejercicio 4](EjercicioTay4.java)

