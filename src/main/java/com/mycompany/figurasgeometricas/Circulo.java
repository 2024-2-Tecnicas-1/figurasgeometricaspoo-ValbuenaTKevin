package com.mycompany.figurasgeometricas;
class Circulo extends FigurasGeometricas{
    private double radio;
    
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
       
        public double obtenerArea() {
        return Math.PI * (radio * radio);
    }


    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    } 
    
}
