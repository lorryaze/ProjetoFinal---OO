package registroaluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
		
public class Main {
	
	private static Scanner in;
        private static List<Aluno> colegas = new ArrayList<Aluno>();
        private static List<Turma> turmas = new ArrayList<Turma>();
        private static String resposta;
        private static int j = 0;
        private static int s = 0;

	public static void main(String[] args) {
           
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
                        System.out.println("Digite o nome da disciplina");
                        b.setDisciplina(in.nextLine());
                        turmas.add(b);
                    }
                    else
                        break;
                }    
                
                Aluno.print(colegas);
                
                while(j < 2){
                    System.out.println("Digite a disciplina que deseja matricular o aluno");
                    resposta = in.nextLine();
                    s = 0;
                    while(s<2){        
                    if(resposta.equals(turmas.get(j).getDisciplina())){
                                turmas.get(j).matricular();
                                s = 0;
                                break;
                            }
                    s++;
                    }                 
                    j++;
                }
                
                Turma.print();

                                
	}

}
