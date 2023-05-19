package Exercicio01;

public class FuncionarioMensalista extends Funcionario {
    private double salario;
    public FuncionarioMensalista() {
    }
    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario) {
        setNome(nome);
        setFuncao(funcao);
        setNumeroCracha(numeroCracha);
        setSetor(setor);
        this.salario = salario;
    }
    public String imprimir() {
        return "Numero do Cracha: " + getNumeroCracha() + " Nome: " + getNome() + " Setor: " + getSetor() + " Função: " + getFuncao() + " Salario: " + salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}
