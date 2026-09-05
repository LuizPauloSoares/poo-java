

package logicajava.Herança;



public class Loja {

    public static void main(String[] args) {
        Estagiario  e = new Estagiario ("Matheus",1200,1000);
        Funcionario f = new Funcionario("Felipe",2000);
        Gerente     g = new Gerente    ("Lucas",10000,1000);
       
        e.exibirinfo();
        f.exibirinfo();
        g.exibirinfo();
        
        
    }
    
}
