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

[Ejercicio Metodo de Euler 1](EjemploEuler.java)

[Ejercicio Metodo de Euler 2](EjemploEuler2.java)

[Ejercicio Metodo de Euler 3](EjemploEuler3.java)

[Ejercicio Metodo de Euler 4](EjemploEuler4.java)

## Metodo de Adams-Bashforth

El método de Adams-Bashforth es un método explícito de pasos múltiples utilizado para resolver ecuaciones diferenciales ordinarias (EDOs). Este método utiliza múltiples puntos anteriores para estimar el valor de la solución en el siguiente paso. Aquí está el método de Adams-Bashforth en su forma general:

𝑦𝑛+1=𝑦𝑛+ℎ∑𝑖=0𝑘−1𝛽𝑖𝑓(𝑡𝑛−𝑖,𝑦𝑛−𝑖)yn+1=yn+h∑i=0k−1βif(tn−i,yn−i)

donde:

𝑦𝑛+1yn+1 es el valor de la solución en el siguiente paso.

𝑦𝑛yn es el valor de la solución en el paso actual.

ℎh es el tamaño del paso.

𝑓(𝑡,𝑦)f(t,y) es la función que define la ecuación diferencial.

𝑡𝑛−𝑖tn−i y 𝑦𝑛−𝑖yn−i son los puntos de tiempo y de la solución en pasos anteriores, respectivamente.

𝛽𝑖βi son los coeficientes de ponderación, que dependen del orden del método.

Los coeficientes 𝛽𝑖βi se derivan de la fórmula de diferenciación hacia atrás de Newton y se eligen para minimizar el error de truncamiento.

[![Screen-Shot-2022-07-26-at-12-19-24-PM.png](https://i.postimg.cc/sX6NJX4S/Screen-Shot-2022-07-26-at-12-19-24-PM.png)](https://postimg.cc/BLFpSJyQ)

[Ejercicio Metodo de Adams-Bashforth 1](EjercicioAdams1.java)

[Ejercicio Metodo de Adams-Bashforth 2](EjercicioAdams2.java)

[Ejercicio Metodo de Adams-Bashforth 3](EjercicioAdams3.java)

[Ejercicio Metodo de Adams-Bashforth 4](EjercicioAdams4.java)


## Metodo de Taylor

El método de Taylor es una técnica numérica para resolver ecuaciones diferenciales ordinarias (EDOs) basada en la expansión en serie de Taylor de la solución de la ecuación. Este método utiliza la serie de Taylor para aproximar la solución de la EDO en intervalos pequeños, proporcionando una forma sistemática de estimar el valor de la función en puntos sucesivos a partir de su valor en un punto inicial.

Concepto Básico

Dada una EDO de primer orden:
𝑑𝑦/𝑑𝑡=𝑓(𝑡,𝑦)dtdy=f(t,y)

y una condición inicial 𝑦(𝑡0)=𝑦0y(t0)=y0, el método de Taylor aproxima la solución en un punto 𝑡1=𝑡0+ℎt1=t0+h usando la serie de Taylor truncada de 𝑦(𝑡)y(t) alrededor de 𝑡0t0:

𝑦(𝑡)=𝑦(𝑡0)+𝑦′(𝑡0)(𝑡−𝑡0)+𝑦′′(𝑡0)2!(𝑡−𝑡0)2+𝑦′′′(𝑡0)3!(𝑡−𝑡0)3+⋯y(t)=y(t0)+y′(t0)(t−t0)+2!y′′(t0)(t−t0)2+3!y′′′(t0)(t−t0)3+⋯

Al truncar la serie después de un número finito de términos, se obtiene una aproximación de la solución. Por ejemplo, utilizando hasta la segunda derivada, la fórmula sería:

𝑦(𝑡1)≈𝑦(𝑡0)+𝑦′(𝑡0)ℎ+𝑦′′(𝑡0)2!ℎ2y(t1)≈y(t0)+y′(t0)h+2!y′′(t0)h2

Implementación

Para aplicar el método de Taylor, es necesario conocer las derivadas de la función 𝑓(𝑡,𝑦)f(t,y). Por ejemplo, si 𝑓(𝑡,𝑦)f(t,y) es la función de la EDO, 𝑦′(𝑡0)=𝑓(𝑡0,𝑦(𝑡0))y′(t0)=f(t0,y(t0)) y 𝑦′′(𝑡0)y′′(t0) se puede obtener diferenciando 𝑓(𝑡,𝑦)f(t,y) con respecto a 𝑡t.


[![Image371.gif](https://i.postimg.cc/5yW3ngJv/Image371.gif)](https://postimg.cc/gX480vnk)

[Ejercicio Metodo de Taylor 1](EjercicioTay1.java)

[Ejercicio Metodo de Taylor 2](EjercicioTay2.java)

[Ejercicio Metodo de Taylor 3](EjercicioTay3.java)

[Ejercicio Metodo de Taylor 4](EjercicioTay4.java)

