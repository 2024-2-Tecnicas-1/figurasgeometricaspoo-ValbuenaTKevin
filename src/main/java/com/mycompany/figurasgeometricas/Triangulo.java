package com.mycompany.figurasgeometricas;
public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;
    
    public Triangulo(String nombre, String color,double base,double altura) {
        super(nombre, color);
        this.altura = altura;
        this.base = base;
    }
    
    public double obtenerArea(){
        return (base * altura ) / 2;
    }
    
    public double obtenerPerimetro(){
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa;
    }
}
