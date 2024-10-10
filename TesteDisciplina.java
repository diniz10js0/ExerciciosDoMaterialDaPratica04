import javax.swing.JOptionPane;
public class TesteDisciplina {
    public static void main(String[] args) {
        // Dados da disciplina
        String nome = "Programacao De Solucoes Computacionais";
        String professor = "Gustavo Alves Diniz";
        int semestre = 3;
        boolean ofertada = true;

        // Criar a disciplina
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

         // Exibir a disciplina
         System.out.println(disciplina);
         }
}