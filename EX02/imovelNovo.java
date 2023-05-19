package EX02;

public class imovelNovo extends imovel {

    private double valorAdicional;

    public imovelNovo() {

    }

    public imovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        this.valorAdicional = valorAdicional;
        setCodigo(codigo);
        setEndereco(endereco);
        setValor(valor);
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public double calcularvalorImovel(){
        setValor(getValor() + valorAdicional);
        return getValor() + valorAdicional;
    }

    public String imprimir(){
        return "Código: " + getCodigo() +
               "\nEndereço: " + getEndereco() +
               "\nValor: " +  getValor();
    }
}
