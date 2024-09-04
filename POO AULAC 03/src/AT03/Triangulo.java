package AT03;
import java.lang.Math;


public class Triangulo {

    double a;
    double b;
    double c;


    public double calcularArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public void mostrarInformacoes() {
        System.out.printf("Lado a: %.2f%n", a);
        System.out.printf("Lado b: %.2f%n", b);
        System.out.printf("Lado c: %.2f%n", c);
        System.out.printf("Área: %.2f%n", calcularArea());
    }
}
