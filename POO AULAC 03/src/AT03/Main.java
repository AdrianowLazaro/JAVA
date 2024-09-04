package AT03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Triangulo trianguloX = new Triangulo();
        System.out.println("Digite as medidas dos lados do triângulo X:");
        trianguloX.a = scanner.nextDouble();
        trianguloX.b = scanner.nextDouble();
        trianguloX.c = scanner.nextDouble();


        Triangulo trianguloY = new Triangulo();
        System.out.println("Digite as medidas dos lados do triângulo Y:");
        trianguloY.a = scanner.nextDouble();
        trianguloY.b = scanner.nextDouble();
        trianguloY.c = scanner.nextDouble();


        System.out.println("\nDados do triângulo X:");
        trianguloX.mostrarInformacoes();

        System.out.println("\nDados do triângulo Y:");
        trianguloY.mostrarInformacoes();


        double areaX = trianguloX.calcularArea();
        double areaY = trianguloY.calcularArea();


        if (areaX > areaY) {
            System.out.println("O triângulo X possui a maior área.");
        } else if (areaY > areaX) {
            System.out.println("O triângulo Y possui a maior área.");
        } else {
            System.out.println("Os triângulos X e Y possuem áreas iguais.");
        }

        scanner.close();
    }
}
