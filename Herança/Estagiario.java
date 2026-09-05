
package logicajava.Herança;


public class Estagiario extends Funcionario {
    private int horasTrabalhadas;

    public Estagiario(String nome, double salario, int horasTrabalhadas ) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public void exibirinfo(){
        System.out.println("Nome : " + getNome());
        System.out.println("Salario : " + getSalario());
        System.out.println("Horas trabalhadas : " + getHorasTrabalhadas());
    }
}
