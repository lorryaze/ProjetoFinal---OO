package gerenciadorAcademico;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;

public class MenuCadastroAluno {
    static Aluno novoAluno;
    private static List<Aluno> alunos = new ArrayList<Aluno>();
    private static JButton confirmar;
    private static Object TamanhoText;
    private int tamMax;
    private static MaskFormatter mascara;
    private static JFrame janela;
    private static JTextField JTFnome, JTFmatricula;
    private static JLabel JLnome, JLmatricula;
        
    public static void cadastrarAlunoGUI(Aluno aluno) {
	janela = new JFrame("Cadastro de Alunos");
		
	JTFnome = new JTextField();
	JTFmatricula = new JTextField();
                
        try {
            mascara = new MaskFormatter("##/#######");
		
	} catch(ParseException exp) {
            mascara.setPlaceholderCharacter('_');
	}
                
        JFormattedTextField matriculaF = new JFormattedTextField(mascara);		
	JLnome = new JLabel("Nome:");		
	JLmatricula = new JLabel("Matricula:");		
	confirmar = new JButton("CADASTRO");
        
	janela.getContentPane().add(JLnome);
	janela.getContentPane().add(JTFnome);
	janela.getContentPane().add(JLmatricula);
        janela.getContentPane().add(matriculaF);
	janela.getContentPane().add(confirmar);
		
	janela.setMinimumSize(new Dimension(300, 300));
	janela.setLayout(new GridLayout(6, 2, 3, 3));
        
        Rectangle r = new Rectangle(200,20);
        JTFnome.setBounds(r);
		
	confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = JTFnome.getText();
		String matricula = matriculaF.getText();		
		String message = "Aluno :"+nome+" \nMatriculla : "+matricula+"\nConfirmar dados cadastrados?";

		int op = JOptionPane.showConfirmDialog(null, message, "Confirmação", JOptionPane.YES_NO_OPTION);
		if (op == JOptionPane.YES_OPTION) {
                    novoAluno = new Aluno();
                    novoAluno.setNome(nome);
                    novoAluno.setMatricula(matricula);
                    if (!novoAluno.isErro()) {
			alunos = Aluno.cadastrar(novoAluno);
			janela.dispose();
                    }
		}		
            }
        });			
		
        janela.pack();
	janela.setVisible(true);
        
    }
}