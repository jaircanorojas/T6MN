    public class EjercicioTay4 {

    // Definición de la función f1(t, x, y) de la EDO dx/dt = f1(t, x, y)
    public static double f1(double t, double x, double y) {
        return y;
    }

    // Definición de la función f2(t, x, y) de la EDO dy/dt = f2(t, x, y)
    public static double f2(double t, double x, double y) {
        return -x;
    }

    // Definición de la segunda derivada de f1(t, x, y)
    public static double df1dt(double t, double x, double y) {
        return f2(t, x, y); // Para dx/dt = y, d^2x/dt^2 = dy/dt = -x
    }

    // Definición de la segunda derivada de f2(t, x, y)
    public static double df2dt(double t, double x, double y) {
        return -f1(t, x, y); // Para dy/dt = -x, d^2y/dt^2 = -dx/dt = -y
    }

    // Implementación del método de Taylor de segundo orden para sistemas de EDOs
    public static double[] taylorSecondOrderSystem(double t0, double x0, double y0, double t, double h) {
        int n = (int)((t - t0) / h); // Número de pasos

        double x = x0;
        double y = y0;
        for (int i = 0; i < n; i++) {
            double f1_0 = f1(t0, x, y);
            double f2_0 = f2(t0, x, y);
            double f1_1 = df1dt(t0, x, y);
            double f2_1 = df2dt(t0, x, y);

            x += f1_0 * h + 0.5 * f1_1 * h * h;
            y += f2_0 * h + 0.5 * f2_1 * h * h;
            t0 += h;
        }

        return new double[]{x, y};
    }

    public static void main(String[] args) {
        double t0 = 0, x0 = 1, y0 = 0, t = 2, h = 0.1;
        double[] result = taylorSecondOrderSystem(t0, x0, y0, t, h);
        System.out.println("El valor de x en t es: " + result[0]);
        System.out.println("El valor de y en t es: " + result[1]);
    }
}
