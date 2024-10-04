import javax.swing.JOptionPane;
public class TesteTurma {

   // cadastrar uma nova turma no metodo main
   public static void main(String[] args) {
      // coletando os dados da turma a ser cadastrada
      String nome = JOptionPane.showInputDialog("Nome da turma");
      String curso = JOptionPane.showInputDialog("Curso");
   int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
   int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
   // criar um objeto turma
   Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
   // montar a String de saida chamando os metodos de acesso da turma
   String msg = "Nome da turma: " + turma.getNome() + "\nCurso: "
               + turma.getCurso() + "\nQuantidadeDeAlunos: " + turma.getQuantidadeDeAlunos() + "\nSerie:" + turma.getSerie();
   // mostra a turma
   JOptionPane.showMessageDialog(null, msg);
   // muda usando os metodo modificadores
   turma.setCurso(curso);
   turma.setquantidadeDeAlunos(quantidadeDeAlunos);
   turma.setSerie(serie);
   // mostra novamente o cadastro da turma
   // altera informacoes; nao precisa criar todas as variaveis novamente
quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade De Alunos"));
   // muda usando os metodo modificadores
   turma.setquantidadeDeAlunos(quantidadeDeAlunos);
 
// monta a String de saida chamando os metodos de acesso da turma
msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
+ "\nQuantidade De Alunos: " + turma.getQuantidadeDeAlunos() + "\nSerie:" + turma.getSerie();
   // mostra a turma
   JOptionPane.showMessageDialog(null, msg);
   }
}