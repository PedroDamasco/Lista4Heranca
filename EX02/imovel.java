package EX02;

public class imovel {

    private int codigo;
    private String endereco;
    private double valor;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

    public imovel() {

    }

    public imovel(int codigo, String endereco, double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
