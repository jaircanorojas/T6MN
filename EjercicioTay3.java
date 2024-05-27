public class EjercicioTay3 {

    // Definición de la función f(t, y) de la EDO dy/dt = f(t, y)
    public static double f(double t, double y) {
        return y; // Ejemplo: dy/dt = y
    }

    // Definición de la derivada de f(t, y) con respecto a t y y para obtener y''
    public static double dfdt(double t, double y) {
        return y; // Para dy/dt = y, df/dt = y
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
        double t0 = 0, y0 = 1, t = 1, h = 0.1;
        double yNumerico = taylorSecondOrder(t0, y0, t, h);
        double yAnalitico = Math.exp(t);
        System.out.println("El valor numérico de y en t es: " + yNumerico);
        System.out.println("El valor analítico de y en t es: " + yAnalitico);
    }
}
