package mision_tic_2022_polimorfismo_ejercicio;
public class Triangulo extends Figuras{
    public Triangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void area(){
        int area = (base*altura)/2;
        System.out.println("El área del triangulo " + area);
    }
    
}
