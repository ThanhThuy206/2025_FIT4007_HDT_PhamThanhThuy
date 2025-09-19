import java.util.Scanner;

public class bai4 {
    static class Circle {
        private double r;
        public Circle() {
            this.r =  1;
        }

        public Circle(double r) {
            this.r = r;
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

// tt hình tròn
    public void output() {
        System.out.println("Bán kính r: " + r);
    }

// tính diện tích
    public double dienTich() {
        return Math.PI * r * r;
    }
// chi vi
    public double chuVi() {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        System.out.print("Nhập bán kính r: ");
        double r = sc.nextDouble();
        c.setR(r);

        System.out.println("\nThông tin hình tròn:");
        c.output();
        System.out.printf("Diện tích hình tròn: %.2f\n", c.dienTich());
        System.out.printf("Chu vi hình tròn: %.2f\n", c.chuVi());

        sc.close();
    }

    }
}
