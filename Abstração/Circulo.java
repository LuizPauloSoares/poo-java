
package logicajava.Abstração;

public class Circulo extends Forma {
    double raio;
    
    public Circulo(String nome,double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        double Area = Math.PI * (raio * raio);
        System.out.println(Area);
        return  Area;
    }

    @Override
    double calcularPerimetro() {
        double Perimetro;
        Perimetro = 2 * Math.PI * raio;
        System.out.println(Perimetro);
        return Perimetro;
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Circulo");
    }
    
}
