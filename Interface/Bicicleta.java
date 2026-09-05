
package logicajava.Interface;


public class Bicicleta implements Veiculo {
    String marca;
    String tipo;
    double velocidade;
    

    @Override
    public void acelerar() {
        velocidade = velocidade + 10;
    }

    @Override
    public void frear() {
        velocidade = velocidade - 10;    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidade: " + velocidade);
   }

    public Bicicleta(String marca, String tipo, double velocidade) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

 
}
