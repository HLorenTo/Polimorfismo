package mision_tic_2022_polimorfismo_ejercicio;
public class Cuadrado extends Figuras{
    public Cuadrado (int lado){
        this.lado = lado;
    }
    @Override
    public void area(){
        int area = (lado*lado);
        System.out.println("El área del cuadrado "+area);
    }
    
    
}
