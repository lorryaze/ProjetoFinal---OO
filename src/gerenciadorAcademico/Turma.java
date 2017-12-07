package gerenciadorAcademico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Turma extends Aluno {
    private String disciplina;
    private int tamanho = 0;
    private List<Aluno> matriculados = new ArrayList<Aluno>();
    private List<Turma> turmas = new ArrayList<Turma>();
    private Avaliacao avalia = new Avaliacao();
    private String matricula;
    private String aux;   
    private static Scanner in;
    
    public  Turma(){
    
    }

    public Turma(String disciplina, int tamanho) {
        this.disciplina = disciplina;
        this.tamanho = tamanho;
    }
    
    public Avaliacao getAvalia() {
        return avalia;
    }    

    public void setAvalia(Avaliacao avalia) {
        this.avalia = avalia;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
         if (disciplina.equals("")) {
            try {
		throw new EspacoEmBrancoException("A disciplina não pode ser em branco.");
            } catch (EspacoEmBrancoException e) {
                JOptionPane.showMessageDialog(null, "A disciplina não pode estar em branco. Insira novamente.", "ERRO!", JOptionPane.ERROR_MESSAGE);			
            }
	} 
        else
            this.disciplina = disciplina;
    }

    public List<Aluno> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(List<Aluno> matriculados) {
        this.matriculados = matriculados;
    }    
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }  
      
    public int getTamanho() {
        return tamanho;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public List cadastrarTurma(Turma a){                

        this.turmas.add(a);           
                
        JOptionPane.showMessageDialog(null, a.disciplina +" cadastrada com sucesso!", "Cadastrada!", JOptionPane.PLAIN_MESSAGE);
                
        return this.turmas;
    }
       
    public List matricular(){
        in = new Scanner(System.in);                
        matricula = in.nextLine();                    
        for(int i = 0; i < Aluno.getAlunos().size(); i++){                                            
            if(Aluno.getAlunos().get(i).getMatricula().equals(matricula)){
                matriculados.add(Aluno.getAlunos().get(i));
                JOptionPane.showMessageDialog(null, Aluno.getAlunos().get(i).getNome() +" matriculado(a) com sucesso!", "Matriculado(a)!", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
        return matriculados;
    }
	
    public  void excluirAluno (Aluno a) {
        if(Aluno.pesquisar(a) == 1){
            matriculados.remove(a);
            System.out.println("O aluno " + a.getNome() + " foi desmatriculado.");
        }
        else
            System.out.println("O aluno não está matriculado");
    }
        
    public  void print() {               
                for(int i = 0; i < matriculados.size(); i++){
                    System.out.println(matriculados.get(i).toString());
                }
    }      
   
    public String toString(){             
        return "Nome: " + this.getNome() +'\n' + "Matrícula: " + this.getMatricula();
    }

    List<Aluno> matricular(Aluno get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
	
}
