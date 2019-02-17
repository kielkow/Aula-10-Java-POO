package aula10;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;

    public Funcionario(String setor, boolean trabalhando) {
        this.setor = setor;
        this.trabalhando = true;
    }

    public Funcionario() {
        this.setTrabalhando(true);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    public void mudarTrabalho(){
        this.setTrabalhando(!(this.getTrabalhando()));
    }
    
        public void status(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n"
                                          + "Idade: " + this.getIdade() + "\n"
                                          + "Sexo: " + this.getSexo() + "\n"
                                          + "Setor: " + this.getSetor() + "\n"
                                          + "Trabalhando: " + this.getTrabalhando()
                                      );
    }
    
    
}
