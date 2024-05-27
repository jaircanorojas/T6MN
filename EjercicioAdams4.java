public class EjercicioAdams4 {
    // Define the differential equation dy/dt = f(t, y)
    public static double f(double t, double y) {
        return -2 * y + t;
    }

    public static void main(String[] args) {
        double t0 = 0;   // Initial time
        double y0 = 1;   // Initial value of y
        double h = 0.1;  // Step size
        int steps = 100; // Number of steps

        // Initial steps using Euler's method
        double t1 = t0 + h;
        double y1 = y0 + h * f(t0, y0);

        double t = t1;
        double y = y1;
        double yPrev = y0;

        for (int i = 2; i < steps; i++) {
            double yNext = y + (h / 2) * (3 * f(t, y) - f(t - h, yPrev));
            t = t + h;
            yPrev = y;
            y = yNext;
            System.out.println("Step " + i + ": t = " + t + ", y = " + y);
        }
    }
}
