package registroaluno;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Iterator;

public class Aluno {

	private String nome;
	private String matricula;
	
//	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	//Criar atributo do tipo turma/
	
	//static Iterator <Aluno> runlist = alunos.iterator();
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String matricula) {
		setNome(nome);
		setMatricula(matricula);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
	
	/*public static void cadastrar (Aluno a) {
		alunos.add(a);
	}*/
	
	/*public static Aluno pesquisar (String m) {
		
	}*/
	
	/*public static boolean excluir (Aluno a) {
		
	}*/
	
	/*public static void print(Array alunos) {
		while(runlist.hasNext()) {
			System.out.println(runlist.next());
		}*/
	//}
	
	
	
	
	
}
