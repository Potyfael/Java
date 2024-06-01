public class Invoice {

    private String codigo, descricao;
    private int quantidade;
    private double preco;

    public Invoice(String codigo, String descricao, int quantidade, double preco) {
        this.codigo = codigo;
        this. descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double totalAmount() {
        return preco * quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
