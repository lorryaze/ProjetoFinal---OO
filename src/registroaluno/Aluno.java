package registroaluno;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aluno {

	private String nome;
	private String matricula;
	
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	//Criar atributo do tipo turma/
	
	//private static Iterator <Aluno> runlist = alunos.iterator();
		
	public Aluno() {

	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
             this.nome = nome;
            /*try
                this.nome = nome;
                if(nome = null){
                    
                }
            } catch(NullPointerException e){
                
            }*/
                
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	

        public static List<Aluno> getAlunos() {
            return alunos;
        }
	
	public static List cadastrar (Aluno a) {
		alunos.add(a);
                return alunos;
	}
	
	public static int pesquisar (Aluno a) {
		if(alunos.contains(a))
                    return 1;
                else
                    return 0;
        }
	
	public static void excluir (Aluno a) {
                if(Aluno.pesquisar(a) == 1){
                    alunos.remove(a);
                    System.out.println("O aluno " + a.getNome() + " foi excluído.");
                }
                else
                    System.out.println("O aluno não está cadastrado");
	}
	
	public static void print(List alunos) {               
                for(int i = 0; i < alunos.size(); i++){
                    System.out.println(alunos.get(i).toString());
                }
        }
        
        public String toString(){             
                 return "Nome: " + this.getNome() +'\n' + "Matrícula: " + this.getMatricula();
         }
	
	
	
	
	
}
