package gerenciadorAcademico;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuCadastroTurma {
	
    static Turma novaTurma;
    private static JFrame janela;
    private static JTextField JTFDisciplina;
    private static JLabel JLDisciplina;
    private static JButton cadastrar;
    private static JLabel JL;
	
public static void cadastrarTurmaGUI(Turma turma){
		
    janela = new JFrame("Cadastro de Turmas");
    JLDisciplina = new JLabel("Nome:");
    JTFDisciplina = new JTextField();
    cadastrar = new JButton("Cadastrar");
			
    janela.getContentPane().add(JLDisciplina);
    janela.getContentPane().add(JTFDisciplina);
    JL = new JLabel();
    janela.getContentPane().add(JL);
    janela.getContentPane().add(JL);
    janela.getContentPane().add(cadastrar);
		
    janela.setMinimumSize(new Dimension(300, 300));
    janela.setLayout(new GridLayout(6, 2, 3, 3));
		
    cadastrar.addActionListener( new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String nome = JTFDisciplina.getText();            	
            novaTurma = new Turma();
            novaTurma.setDisciplina(nome);
            novaTurma.setAvalia(new Avaliacao());
            turma.cadastrarTurma(novaTurma);            
            janela.dispose();
        }
    });		
		
    janela.pack();
    janela.setVisible(true);
    }
}