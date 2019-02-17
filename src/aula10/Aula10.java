package aula10;

import javax.swing.JOptionPane;

public class Aula10 {

    public static void main(String[] args) {
        
     Pessoa p1 = new Pessoa();
     Aluno p2 = new Aluno();
     Professor p3 = new Professor();
     Funcionario p4 = new Funcionario();
     
     
     p2.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
     p2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:")));
     p2.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
     p2.setCurso(JOptionPane.showInputDialog("Digite o nome do curso:"));
     p2.status();
     p2.cancelarMatr();
     p2.fazerAniver();
     p2.status();
     
     
     p3.setNome(JOptionPane.showInputDialog("Digite o nome do professor:"));
     p3.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor:")));
     p3.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
     p3.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do professor:")));
     p3.setEspecialidade(JOptionPane.showInputDialog("Digite a especialidade: "));
     p3.status();
     p3.receberAum();
     p3.fazerAniver();
     p3.status();
     
     
     p4.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario:"));
     p4.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario:")));
     p4.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
     p4.setSetor(JOptionPane.showInputDialog("Digite o setor do funcionario:"));
     p4.status();
     p4.mudarTrabalho();
     p4.fazerAniver();
     p4.status();
     
     
     
     
     
         
    }
    
}
 