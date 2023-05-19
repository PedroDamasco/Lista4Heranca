package Exercicio02;
public class ImovelVelho extends imovel {

    private double valorDesconto;

    public ImovelVelho() {

    }

    public ImovelVelho(int codigo, String endereco, double valor, double valorDesconto) {
        setCodigo(codigo);
        setEndereco(endereco);
        setValor(valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calcularvalorImovel(){
        setValor(getValor() - valorDesconto);
        return getValor() - valorDesconto;
    }

    public String imprimir(){
        return "Código: " + getCodigo() +
               "\nEndereço: " + getEndereco() +
               "\nValor: " +  getValor();
    }
}
