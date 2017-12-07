package gerenciadorAcademico;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Interface {

    private static JFrame janela;
    private static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    //static MenuRelatorioAluno menuRA  = new MenuRelatorioAluno();
    static MenuCadastroAluno cAluno = new MenuCadastroAluno();
    static MenuCadastroTurma cTurma = new MenuCadastroTurma();
    //static MenuRelatorioTurma menuRT  = new MenuRelatorioTurma();
    static MenuMatriculaAluno mAluno = new MenuMatriculaAluno();
    static MenuCadastroAvaliacao cAvaliacao = new MenuCadastroAvaliacao();
    static Avaliacao aval;
    private Turma b;

    public static void GUI(Aluno a, Turma b) {

        janela = new JFrame("GERENCIADOR ACADÊMICO");

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1 = new JButton("Cadastro de Alunos");
        btn2 = new JButton("Relatorio Alunos");
        btn3 = new JButton("Cadastro de Turmas");
        btn4 = new JButton("Relatorio Turmas");
        btn5 = new JButton("Cadastro de Atividades");
        btn6 = new JButton("Relatorio de Notas");
        btn7 = new JButton("Matricular Alunos");
        //btn8 = new JButton("Lista de presença");

        janela.getContentPane().add(btn1);
        janela.getContentPane().add(btn2);
        janela.getContentPane().add(btn3);
        janela.getContentPane().add(btn4);
        janela.getContentPane().add(btn5);
        janela.getContentPane().add(btn6);
        janela.getContentPane().add(btn7);
        //janela.getContentPane().add(btn8);

        janela.setMinimumSize(new Dimension(600, 600));
        janela.setLayout(new GridLayout(4, 2, 5, 5));

        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cAluno.cadastrarAlunoGUI(a);
            }

        });

        /*btn2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                menuRA.apresentarGUIExibir(a);
            }

        });
        */
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cTurma.cadastrarTurmaGUI(b);
            }

        });

        /*btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuRT.apresentarGUIExibir(t);
            }

        });
        */
        
        btn5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cAvaliacao.cadastrarAvaliacaoGUI(b);
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        btn7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                mAluno.matricularAlunoGUI(a, b);
            }
        });

        /*btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }

        });*/

        janela.pack();
        janela.setVisible(true);

    }

}
