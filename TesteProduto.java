import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        // Lendo os valores do produto
        String nome = JOptionPane.showInputDialog("Nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto:"));

        // Instanciando um objeto Produto
        Produto produto = new Produto(nome, preco, quantidade);

        // monta a String de saida chamando os métodos de acesso do produto
        String msg = "Produto criado:\n" +
                     "Nome: " + produto.getNome() + "\n" +
                     "Preco: " + produto.getPreco() + " reais\n" +
                     "Quantidade: " + produto.getQuantidade() + " unidades";
        // mostra o produto
   JOptionPane.showMessageDialog(null, msg);
   // altera informações; não precisa criar todas as variáveis novamente
   quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
   preco = Double.parseDouble(JOptionPane.showInputDialog("Preco"));
   // muda usando os métodos modificadores
   produto.setNome(nome);
   produto.setPreco(preco);
   produto.setQuantidade(quantidade);
   // mostra novamente o cadastro do produto
   // monta a String de saída chamando os métodos de acesso do produto
   msg = "Nome: " + produto.getNome() + "\nPreco: " + produto.getPreco()
        + " reais" + "\nQuantidade: " + produto.getQuantidade() + " unidades";
      // mostra o produto
   JOptionPane.showMessageDialog(null, msg);
   }
}