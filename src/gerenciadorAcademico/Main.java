package gerenciadorAcademico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
		
public class Main {
	
	/*private static Scanner in;
        private static List<Turma> turmas = new ArrayList<Turma>();
        private static String resposta;
        private static Turma c;
        private static Interface inter;
        private static int j;
        private static int s;
        */
        
	public static void main(String[] args) {
             Aluno a = new Aluno();
	     Turma b = new Turma();
		
            Interface.GUI(a,b);
          /*  
                inter = new Interface();       
                inter.apresentarGUI();
		in = new Scanner (System.in);
                
                for(int z = 0; z< 3; z++){
                    Aluno a = new Aluno();
                    System.out.println("Digite o nome do aluno");
                    a.setNome(in.nextLine());	
                    System.out.println("Digite a matrícula do aluno");
                    a.setMatricula(in.nextLine());		
                    colegas = Aluno.cadastrar(a);
                }
                
                for(int i = 0; i < 30; i++){
                System.out.println("Deseja criar uma nova turma?(S/N)");
                resposta = in.nextLine();
                    if(resposta.equals("S")){
                        Turma b = new Turma();
                        turmas = Turma.cadastrarTurma(b);
                    }
                    else
                        break;
                }    
                
                Aluno.print(colegas);
                
                              
                
                System.out.println("Digite a disciplina que deseja matricular o aluno");
                resposta = in.nextLine();
                
                /*while(j<3){                    
                    if(resposta.equals(turmas.get(j).getDisciplina())){                        
                        System.out.println("Digite a matricula do aluno que deseja matricular:");
                        turmas.get(j).matricular();  
                        turmas.get(j).print();
                        j = 0;
                        System.out.println(turmas.get(j).getDisciplina());

                        System.out.println("Digite a disciplina que deseja matricular o aluno");
                        resposta = in.nextLine();
                    }
                    
                    j++;
                }
                j = 0;
                while(j < 3){
                       s = 0;
                        while(s < 2){ 
                        System.out.println("Digite a disciplina do aluno que deseja matricular:");
                        resposta = in.nextLine();
                         
                        if(resposta.equals(turmas.get(s).getDisciplina())){                        
                             System.out.println("Digite a matricula do aluno que deseja matricular:");
                             turmas.get(s).matricular();  
                             turmas.get(s).print();
                             System.out.println(turmas.get(s).getDisciplina());
                             break;
                            }
                        else{
                            s++;
                        }
                    }                 
                    j++;
                }    
               
                

                 
	*/}

}
