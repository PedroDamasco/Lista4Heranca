package Exercicio01;
public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;
  
    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, double valorHora) {
        setNome(nome);
        setFuncao(funcao);
        setNumeroCracha(numeroCracha);
        setSetor(setor);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public String imprimir() {
        return "Numero do Cracha: " + getNumeroCracha() + " Nome: " + getNome() + " Setor: " + getSetor() + " Função: " + getFuncao() + " Quantidade de Horas: " + getQtdeHoras() + " Valor Horas: " + getValorHora();
    }

    /* Get e Set's */
    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
