public class AdamsBashforth1 {
    public static double f(double t, double y) {
        return -2 * y + 1;
    }
// Resolver dy/dt=-2y+1 con y(0)=1
    public static void main(String[] args) {
        double t0 = 0;
        double y0 = 1;
        double h = 0.1;
        int steps = 100;

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
