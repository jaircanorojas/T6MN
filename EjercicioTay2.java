public class EjercicioTay2 {

    // Definición de la función f(t, y) de la EDO dy/dt = f(t, y)
    public static double f(double t, double y) {
        return y - t * t + 1; // Ejemplo: dy/dt = y - t^2 + 1
    }

    // Definición de la derivada de f(t, y) con respecto a t y y para obtener y''
    public static double dfdt(double t, double y) {
        return f(t, y) - 2 * t; // Para dy/dt = y - t^2 + 1, df/dt = dy/dt - 2t
    }

    // Implementación del método de Taylor de segundo orden
    public static double taylorSecondOrder(double t0, double y0, double t, double h) {
        int n = (int)((t - t0) / h); // Número de pasos

        double y = y0;
        for (int i = 0; i < n; i++) {
            double f0 = f(t0, y);
            double f1 = dfdt(t0, y);
            y += f0 * h + 0.5 * f1 * h * h;
            t0 += h;
        }

        return y;
    }

    public static void main(String[] args) {
        double t0 = 0, y0 = 0.5, t = 2, h = 0.1;
        double result = taylorSecondOrder(t0, y0, t, h);
        System.out.println("El valor de y en t es: " + result);
    }
}
