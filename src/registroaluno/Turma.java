/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroaluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sara
 */
public class Turma extends Aluno {
    private static String disciplina;
    private Aluno alunos;
    private static int tamanho;
    private static List<Aluno> matriculados = new ArrayList<Aluno>();
    private static List<Turma> turmas = new ArrayList<Turma>();
    private static String matricula;
    private static Scanner in;

public Turma(){
    
}
    public Turma(String disciplina, Aluno alunos) {
        this.disciplina = disciplina;
        this.alunos = alunos;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

       public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }
       
    public List matricular(){
                in = new Scanner(System.in);
                System.out.println("Digite a matricula do aluno que deseja matricular:");
                matricula = in.nextLine();
                for(int i = 0; i < Aluno.getAlunos().size(); i++){                                            
                    if(Aluno.getAlunos().get(i).getMatricula().equals(matricula)){
                        matriculados.add(Aluno.getAlunos().get(i));
                    }
                }
                return matriculados;
    }
	
    public static void excluir (Aluno a) {
                if(Aluno.pesquisar(a) == 1){
                    matriculados.remove(a);
                    System.out.println("O aluno " + a.getNome() + " foi desmatriculado.");
                }
                else
                    System.out.println("O aluno não está matriculado");
    }
    
    public static List cadastrarTurma(){
                in = new Scanner(System.in);
                System.out.println("Digite a disciplina:");
                disciplina = in.nextLine();
                
                
                return turmas;
    }
    
    public static void print() {               
                for(int i = 0; i < matriculados.size(); i++){
                    System.out.println(matriculados.get(i).toString());
                }
        }
      
   
    public String toString(){             
        return "Nome: " + this.getNome() +'\n' + "Matrícula: " + this.getMatricula();
    }
	
}
