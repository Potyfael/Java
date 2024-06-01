import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String codigo = JOptionPane.showInputDialog("Digite o codigo do produto:");
        String descricao = JOptionPane.showInputDialog("Digite a descricao do produto:");
        String quantidadeF = JOptionPane.showInputDialog("Digite a quantidade de produto disponivel:");
        String precoF = JOptionPane.showInputDialog("Digite o preco do produto:");
        int quantidade = Integer.parseInt(quantidadeF);
        double preco = Double.parseDouble(precoF);

        Invoice x = new Invoice(codigo, descricao,quantidade, preco);

        String message = String.format("""
                        NOTA FISCAL RAFAEL ATACAREJO
                        Código do produto: %s
                        Descricão do produto: %s\

                        Quantidade: %d
                        Preço unitário: %.2f
                        Total: %.2f""",
                x.getCodigo(), x.getDescricao(), x.getQuantidade(), x.getPreco(), x.totalAmount());
        JOptionPane.showMessageDialog(null ,message);
    }
}