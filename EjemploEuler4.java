public class EjemploEuler4 {
    // Define the differential equation dy/dt = f(t, y)
    public static double f(double t, double y) {
        return -3 * y + 2 * t;
    }

    public static void main(String[] args) {
        double t0 = 0;   // Initial time
        double y0 = 1;   // Initial value of y
        double h = 0.1;  // Step size
        int steps = 100; // Number of steps

        double t = t0;
        double y = y0;

        for (int i = 0; i < steps; i++) {
            y = y + h * f(t, y);
            t = t + h;
            System.out.println("Step " + i + ": t = " + t + ", y = " + y);
        }
    }
}
