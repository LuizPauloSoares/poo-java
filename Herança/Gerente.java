
package logicajava.Herança;


public class Gerente extends Funcionario {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public Gerente(String nome,double salario,double bonus){
        super(nome,salario);  
        this.bonus = bonus;
    }
    
    @Override
    public void exibirinfo(){
        System.out.println("Nome : " + getNome());
        System.out.println("Salario : " + getSalario());
        System.out.println("Bonus : " + getBonus());
    }
}
