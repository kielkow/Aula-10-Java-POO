package aula10;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    
    private boolean matr;
    private String curso;

    public Aluno(boolean matr, String curso) {
        this.matr = matr;
        this.curso = curso;
    }
    public Aluno() {
        this.setMatr(true);
    }

    public boolean getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatr(){
        this.setMatr(!(this.getMatr()));
    }
    
    public void status(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n"
                                          + "Idade: " + this.getIdade() + "\n"
                                          + "Sexo: " + this.getSexo() + "\n"
                                          + "Curso: " + this.getCurso() + "\n"
                                          + "Matriculado: " + this.getMatr()
                                      );
    }
    
}
