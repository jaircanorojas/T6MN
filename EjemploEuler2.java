public class EjemploEuler2 {
    public static double f(double t, double y) {
        return y - t * t + 1;
    }

    public static void main(String[] args) {
        double t0 = 0;
        double y0 = 0.5;
        double h = 0.1;
        int steps = 100;

        double t = t0;
        double y = y0;

        for (int i = 0; i < steps; i++) {
            y = y + h * f(t, y);
            t = t + h;
            System.out.println("Step " + i + ": t = " + t + ", y = " + y);
        }
    }
}
