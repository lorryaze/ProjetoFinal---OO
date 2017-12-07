package gerenciadorAcademico;

import java.awt.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.text.MaskFormatter;
import gerenciadorAcademico.Avaliacao;
import gerenciadorAcademico.Turma;

public class MenuCadastroAvaliacao {
	private Turma turma;
       	private static int tamanho;
        private static java.util.List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	private static JPanel p = new JPanel(new BorderLayout());
	private static JFrame janela;
	private static ButtonGroup bg = new ButtonGroup();
	private static JTextField JTFnome, JTFpeso, JTFdisciplina;
	private static JLabel JLnome, JLpeso, JLbotao;
	private static JButton confirmar;
	private static JToggleButton botoes[];
	
    public static void cadastrarAvaliacaoGUI(Turma turma) {		
	tamanho = turma.getTamanho();
	botoes = new JToggleButton[tamanho];
	janela = new JFrame("Cadastro de avaliacoes");
		
	JTFnome = new JTextField();
	JTFpeso = new JTextField();
	JTFdisciplina = new JTextField();	
	JLnome = new JLabel("Nome: ");		
	JLpeso= new JLabel("Peso: ");
		
	janela.getContentPane().add(JLnome);
	janela.getContentPane().add(JTFnome);
	janela.getContentPane().add(JLpeso);
	janela.getContentPane().add(JTFpeso);
		
	janela.setMinimumSize(new Dimension(300, 300));
	janela.setLayout(new GridLayout(0, 1, 1, 1));
		
	JLnome = new JLabel("Disciplina: ");
	janela.getContentPane().add(JLnome);
        //janela.getContentPane().add(JTFdisciplina);
                
	for (int i = 0; i < botoes.length; ++i){		
            JLbotao = new JLabel(turma.getTurmas().get(i).getDisciplina());
            JToggleButton btn = new JToggleButton(turma.getTurmas().get(i).getDisciplina().toString());
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
		}
            });
			
            bg.add(btn);			
            janela.getContentPane().add(btn);
            botoes[i] = btn;            
	}                
	
        JLnome = new JLabel("");
	janela.getContentPane().add(JLnome);
		
	confirmar = new JButton("Cadastrar");
	janela.getContentPane().add(confirmar);       
      
	confirmar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String nome = JTFnome.getText();
            float peso = Float.parseFloat(JTFpeso.getText());
            int i = 0;           	
            Avaliacao a = null;         	
            for(int j = 0;j < botoes.length;j++) {						
		if(botoes[j].isSelected()) {						
                    a = new Avaliacao(nome,peso);
                    i = j;						
                    System.out.println("O botão está selecionado");
		}								
            }  
            
            avaliacoes = turma.getTurmas().get(i).getAvalia().cadastrarAvaliacao(a);
        
            System.out.println("A avaliação " + a.getNome() + " está na turma" + turma.getTurmas().get(i).getDisciplina().toString()); 
        
            janela.dispose();                         
            }
        });
	janela.pack();
	janela.setVisible(true);		
    }
}