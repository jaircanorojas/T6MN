public class EjercicioRK3 {

    // Definición de la función f(x, y) de la EDO dy/dx = f(x, y)
    public static double f(double x, double y) {
        return y;
    }

    // Implementación del método de Runge-Kutta de cuarto orden
    public static double rungeKutta(double x0, double y0, double x, double h) {
        int n = (int)((x - x0) / h); // Número de pasos
        double k1, k2, k3, k4;

        double y = y0;
        for (int i = 1; i <= n; i++) {
            k1 = h * f(x0, y);
            k2 = h * f(x0 + 0.5 * h, y + 0.5 * k1);
            k3 = h * f(x0 + 0.5 * h, y + 0.5 * k2);
            k4 = h * f(x0 + h, y + k3);

            y += (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            x0 += h;
        }

        return y;
    }

    public static void main(String[] args) {
        double x0 = 0, y0 = 1, x = 1, h = 0.1;
        double yNumerico = rungeKutta(x0, y0, x, h);
        double yAnalitico = Math.exp(x);
        System.out.println("El valor numérico de y en x es: " + yNumerico);
        System.out.println("El valor analítico de y en x es: " + yAnalitico);
    }
}