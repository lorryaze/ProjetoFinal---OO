package gerenciadorAcademico;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    private String matricula;
    private boolean erro;
    private static List<Aluno> alunos = new ArrayList<Aluno>();     
   			
    public Aluno() {

    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
	return this.nome;
    }
	
    public void setNome(String nome) {
        if (nome.equals("")) {
            try {
                throw new EspacoEmBrancoException("O nome não pode ser em branco.");
            } catch (EspacoEmBrancoException e) {
		JOptionPane.showMessageDialog(null, "O nome não pode estar em branco. Insira novamente.", "ERRO!", JOptionPane.ERROR_MESSAGE);			
                this.setErro(true);
            }
	} else
            this.nome = nome;
    }
	
    public String getMatricula() {
	return this.matricula;
    }
	
    public void setMatricula(String matricula) {
	if (matricula.equals("  /       ")) {
            try {
		throw new FormatoErradoException("A matrícula está errada!");
            } catch (FormatoErradoException e) {
		JOptionPane.showMessageDialog(null, "Formato da matricula não permitido. Insira a matricula novamente.", "ERRO!", JOptionPane.ERROR_MESSAGE);
                this.setErro(true);
            }
	}else 
            this.matricula = matricula;
    }	

    public static List<Aluno> getAlunos() {
        return alunos;
    }

    public static void setAlunos(List<Aluno> alunos) {
        Aluno.alunos = alunos;
    }    

    public boolean isErro() {
        return erro;
    }

    public void setErro(boolean erro) {
        this.erro = erro;
    }
    
    public static List cadastrar(Aluno a) {
	alunos.add(a);
        String message = String.format("O(a) aluno(a) %s com a matrícula %s"
						+ " foi cadastrado(a)!", a.getNome(),a.getMatricula());
		
	JOptionPane.showMessageDialog(null, message,"Cadastrado!", JOptionPane.PLAIN_MESSAGE);
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
        } else
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
