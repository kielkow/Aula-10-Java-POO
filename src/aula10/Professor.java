package aula10;

import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    
    private String especialidade;
    private double salario;

    
    
    
    public Professor(String especialidade, double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor() {
    }

    
    
    
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    
    public void receberAum(){
        this.setSalario(this.getSalario()+ Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia add ao salario:")));
    }
    
    public void status(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n"
                                          + "Idade: " + this.getIdade() + "\n"
                                          + "Sexo: " + this.getSexo() + "\n"
                                          + "Especialidade: " + this.getEspecialidade() + "\n"
                                          + "Salario: " + this.getSalario()
                                      );
    }
    
    
}
