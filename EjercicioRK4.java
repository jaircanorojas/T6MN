public class EjercicioRK4 {

        // Definición de la función f1(t, x, y) de la EDO dx/dt = f1(t, x, y)
        public static double f1(double t, double x, double y) {
            return y;
        }

        // Definición de la función f2(t, x, y) de la EDO dy/dt = f2(t, x, y)
        public static double f2(double t, double x, double y) {
            return -x;
        }

        // Implementación del método de Runge-Kutta de cuarto orden para sistemas de EDOs
        public static double[] rungeKutta(double t0, double x0, double y0, double t, double h) {
            int n = (int)((t - t0) / h); // Número de pasos
            double k1x, k2x, k3x, k4x;
            double k1y, k2y, k3y, k4y;

            double x = x0, y = y0;
            for (int i = 1; i <= n; i++) {
                k1x = h * f1(t0, x, y);
                k1y = h * f2(t0, x, y);
                k2x = h * f1(t0 + 0.5 * h, x + 0.5 * k1x, y + 0.5 * k1y);
                k2y = h * f2(t0 + 0.5 * h, x + 0.5 * k1x, y + 0.5 * k1y);
                k3x = h * f1(t0 + 0.5 * h, x + 0.5 * k2x, y + 0.5 * k2y);
                k3y = h * f2(t0 + 0.5 * h, x + 0.5 * k2x, y + 0.5 * k2y);
                k4x = h * f1(t0 + h, x + k3x, y + k3y);
                k4y = h * f2(t0 + h, x + k3x, y + k3y);

                x += (k1x + 2 * k2x + 2 * k3x + k4x) / 6;
                y += (k1y + 2 * k2y + 2 * k3y + k4y) / 6;
                t0 += h;
            }

            return new double[]{x, y};
        }

        public static void main(String[] args) {
            double t0 = 0, x0 = 1, y0 = 0, t = 2, h = 0.1;
            double[] resultado = rungeKutta(t0, x0, y0, t, h);
            System.out.println("El valor de x en t es: " + resultado[0]);
            System.out.println("El valor de y en t es: " + resultado[1]);
        }
    }
