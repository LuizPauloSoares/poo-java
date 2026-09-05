
package logicajava.Interface;


public class Main {


    public static void main(String[] args) {
        Veiculo[] v = new Veiculo[3];
        
        v[0] = new Carro("Ford","Fiesta",90);
        v[1] = new Moto("Honda","600 cc",110);
        v[2] = new Bicicleta("Caloi","Mountain Bike",10);
        
        System.out.println("Normal");
        for(Veiculo vc : v){
            System.out.println("----------");
            vc.exibirInfo();
        }
        System.out.println("Acelerar");
        for(Veiculo vc : v){
            System.out.println("----------");            
            vc.acelerar();
            vc.exibirInfo();
        }
        System.out.println("Frear");
       for(Veiculo vc : v){
            System.out.println("----------");            
            vc.frear();
            vc.frear();
            vc.exibirInfo();

        }        
        
    }
    
}
