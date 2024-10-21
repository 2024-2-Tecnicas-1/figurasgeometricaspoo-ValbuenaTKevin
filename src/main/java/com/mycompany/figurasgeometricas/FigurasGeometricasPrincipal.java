package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class FigurasGeometricasPrincipal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre, color;
        double radio, lado1, lado2, base, altura;
        char tecla = ' ';

        System.out.println("Ingrese el nombre de la figura");
        nombre = lector.next();
        System.out.println("Ingrese el color de la figura");
        color = lector.next();
        System.out.println("Ingrese el tipo de figura");
        System.out.println("1: Circulo");
        System.out.println("2: Rectangulo");
        System.out.println("3: Triangulo");
        tecla = lector.next().charAt(0);
        tecla = Character.toLowerCase(tecla);

        switch (tecla) {
            case '1':

                System.out.println("Ingrese el radio del círculo");
                radio = lector.nextDouble();

                Circulo circulo = new Circulo(nombre, color, radio);

                System.out.println("El área del circulo " + circulo.getNombre()+ " de color " + circulo.getColor()+ " es: "+circulo.obtenerArea());
                System.out.println("El perímetro del circulo " + circulo.getNombre()+ " de color " + circulo.getColor()+ " es: "+circulo.obtenerPerimetro());

                break;
            case '2':
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                lado2 = lector.nextDouble();

                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);

                System.out.println("El area del rectangulo " + rectangulo.getNombre() + " de color " + rectangulo.getColor() + " es: " + rectangulo.obtenerArea());
                System.out.println("El perimetro del rectangulo " + rectangulo.getNombre() + " de color " + rectangulo.getColor() + " es: " + rectangulo.obtenerPerimetro());
                break;
            case '3':
                System.out.println("Ingrese el valor de la base del triángulo");
                base = lector.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo");
                altura = lector.nextDouble();

                Triangulo triangulo = new Triangulo(nombre, color, base, altura);

                System.out.println("El area del triangulo " + triangulo.getColor()+" de color " + triangulo.getColor() + " es: " + triangulo.obtenerArea());
                System.out.println("El area del perimetro " + triangulo.getColor()+" de color " + triangulo.getColor() + " es: " + triangulo.obtenerPerimetro());
                break;
            default:
                System.out.println("Tecla inválida");
        }
    }
}
