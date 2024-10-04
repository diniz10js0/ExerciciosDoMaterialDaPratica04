public class Turma {
   //artibutos
   private String nome;
   private String curso; 
   private int quantidadeDeAlunos;
   private int serie;   
   //método construtor
   public Turma (String n, String c, int q, int s) {
      nome= n;
      curso= c;
      quantidadeDeAlunos= q;
      serie= s;
   }
   //métodos de acesso
   public String getNome() {
      return nome;
   }   
   public String getCurso() {
      return curso;
   }
   public int getQuantidadeDeAlunos() {
      return quantidadeDeAlunos;
   }
   public int getSerie() {
      return serie;
   }
  
   //métodos modificadores
   public void setNome(String n) {
      nome= n;
   }
   public void setCurso(String c) {
      curso= c;
   }
   public void setquantidadeDeAlunos(int q) {
      quantidadeDeAlunos= q;
   }
   public void setSerie(int s) {
      serie = s;
   }  
}     