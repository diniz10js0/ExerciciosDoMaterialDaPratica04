import javax.swing.JOptionPane;
public class TesteAluno {

   // cadastrar um novo aluno no metodo main
   public static void main(String[] args) {
      // coletando os dados do aluno a ser cadastrado
      String nome = JOptionPane.showInputDialog("Nome");
   int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
   double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
   // pega o primeiro caracter da String e retorna como char
   char sexo = JOptionPane.showInputDialog("Sexo M/F").charAt(0);
   // cria um objeto aluno
   Aluno aluno = new Aluno(nome, idade, peso, sexo);
   // monta a String de saida chamando os metodos de acesso do aluno
   String msg = "Nome: " + aluno.getNome() + "\nIdade: "
               + aluno.getIdade() + " anos" + "\nPeso: " + aluno.getPeso()
               + " kg";
   if (aluno.getFormando()) {
   msg += "\nFormando: Sim";
   } else {
   msg += "\nFormando: Não";
   }
   if (aluno.getSexo() == 'M') {
   msg += "\nSexo: Masculino";
   } else {
   msg += "\nSexo: Feminino";
   }
   // mostra o aluno
   JOptionPane.showMessageDialog(null, msg);
   // altera informacoes; nao precisa criar todas as variaveis novamente
   idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
   peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
   // tem que digitar true ou false
   boolean formando = Boolean.parseBoolean(JOptionPane
          .showInputDialog("É' formando?true/false"));
   // muda usando os metodo modificadores
   aluno.setIdade(idade);
   aluno.setPeso(peso);
   aluno.setFormando(formando);
   // mostra novamente o cadastro do aluno
   // monta a String de saida chamando os metodos de acesso do aluno
   msg = "Nome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade()
        + " anos" + "\nPeso: " + aluno.getPeso() + " kg";
   if (aluno.getFormando()) {
      msg += "\nFormando: Sim";
   } else {
      msg += "\nFormando: Não";
   }
   if (aluno.getSexo() == 'M') {
      msg += "\nsexo: Masculino";
   } else {
      msg += "\nsexo: Feminino";
   }
   // mostra o aluno
   JOptionPane.showMessageDialog(null, msg);
   }
}