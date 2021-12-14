package mision_tic_2022_polimorfismo_ejercicio;
public class Rectangulo extends Figuras{
    public Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void area(){
        int area = base * altura;
        System.out.println("El área del rectangulo: "+area);
    }
}
