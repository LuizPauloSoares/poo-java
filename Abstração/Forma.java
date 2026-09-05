
package logicajava.Abstração;


abstract class Forma {
    abstract double calcularArea();
    
    abstract double calcularPerimetro();
    
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }
    
    public void exibirInfo() {
        System.out.println(nome);
    }
    
}
