
package logicajava.Abstração;


public class Main {
 
    public static void main(String[] args) {
        
       Forma[] formas = new Forma[3]; 
       
       formas[0] =  new Circulo("Circulo",8.5);    
       formas[1] = new Retangulo("Retangulo",3.5,2.5);
       formas[2] = new Quadrado("Quadrado",5);
    
        for (Forma F : formas){
            F.exibirInfo();
            F.calcularArea();
            F.calcularPerimetro();
            System.out.println("----------------");
        }
    }
}
