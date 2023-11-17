interface Two_D_shape {
    double area();
}

interface Three_D_shape {
    double volume();
}

class Triangle implements Two_D_shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Sphere implements Two_D_shape, Three_D_shape {
    double x, y, z, r;

    Sphere(double x, double y, double z, double r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    public double area() {
        return 4 * Math.PI * r * r;
    }

    public double volume() {
        return 4 / 3 * Math.PI * r * r * r;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle T1 = new Triangle(3, 4, 5);
        Sphere B1 = new Sphere(6, 8, 10, 16);
        Two_D_shape T2 = new Triangle(1, 2, 3);
        Three_D_shape B3 = new Sphere(3, 7);
        Two_D_shape B2 = new Sphere(3, 9);

        System.out.println("The area of T1 is " + T1.area());
        System.out.println("The area and volume of B1 are " + B1.area() + " and " + B1.volume());
        System.out.println("The area of T2 is " + T2.area());
        System.out.println("The area and volume of B3 are " + B3.area() + " and " + B3.volume());
        System.out.println("The area of B2 is " + B2.area());

        int count = 0;
        if (T1 instanceof Two_D_shape) count++;
        if (B1 instanceof Two_D_shape) count++;
        if (T2 instanceof Two_D_shape) count++;
        if (B3 instanceof Two_D_shape) count++;
        if (B2 instanceof Two_D_shape) count++;

        
        System.out.println("There are " + count + " Two_D_shape instances in the assignment.");
