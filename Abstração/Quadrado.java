
package logicajava.Abstração;


public class Quadrado extends Forma {
    int lado;
    
    public Quadrado(String nome,int lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        double Area = lado * lado;
        System.out.println(Area);
        return Area;
    }

    @Override
    double calcularPerimetro() {
        int Perimetro =  4 * lado;
        return Perimetro;
    }
     
    @Override
    public void exibirInfo() {
        System.out.println("Quadrado");
    }
}
