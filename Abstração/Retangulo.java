
package logicajava.Abstração;

public class Retangulo extends Forma {
    double largura;
    double altura;

    
    public Retangulo(String nome,double altura,double largura) {
        super(nome);
        this.altura = altura;
        this.largura = largura;
    }


    @Override
    double calcularArea() {
        double Area = largura * altura;
        System.out.println(Area);
        return Area;
    }

    @Override
    double calcularPerimetro() {
        double Perimetro = 2 * (largura + altura);
        System.out.println(Perimetro);
        return Perimetro;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Retangulo");
    }
    
}
