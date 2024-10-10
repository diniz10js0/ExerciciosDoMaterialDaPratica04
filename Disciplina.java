public class Disciplina {
   // atributos
    private String Disciplina;
    private String Professor;
    private int Semestre;
    private boolean disciplinaOfertada;

    // Método Construtor
    public Disciplina (String disciplina, String professor, int semestre, boolean ofertada) {
       Disciplina = disciplina;
        Professor = professor;
        Semestre = semestre;
        disciplinaOfertada = ofertada;
    }

    // Métodos de acesso 
        public String getDisciplina() {
        return Disciplina;
    }

    public String getProfessor() {
        return Professor;
    }

    public int getSemestre() {
        return Semestre;
    }

    public boolean getDisciplinaOfertada() {
        return disciplinaOfertada;
    }

    // Método modificador
    public void setDisciplina(String nome) {
        Disciplina = nome;
    }

    public void setProfessor(String professor) {
        Professor = professor;
    }

    public void setSemestre(int semestre) {
        Semestre = semestre;
    }

    public void setDisciplinaOfertada(boolean ofertada) {
        disciplinaOfertada = ofertada;
    }

    // Exibir informações da disciplina
    public String toString() {
        return "Disciplina:" + " " +
                "nome='" + Disciplina + '\'' +
                ", professor='" + Professor + '\'' +
                ", semestre=" + " " + Semestre +
                ", ofertada=" + " " + disciplinaOfertada +
                '}';
    }
}