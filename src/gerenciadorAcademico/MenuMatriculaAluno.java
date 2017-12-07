package gerenciadorAcademico;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MenuMatriculaAluno {

    private static JFrame janela;
    private static JButton matricular;
    private static JComboBox<String> alunoList;
    private static JComboBox<String> materiaList;
    private static JList<String> alunosListJ;
    private static ArrayList<String> lista;
    public static JLabel t1 = null;
    public static JLabel t2 = null;
    private static int i;
    private static List<Aluno> matriculados = new ArrayList<>();


    public static void matricularAlunoGUI(Aluno a, Turma b) {
        janela = new JFrame("Matricular Aluno");
        matricular = new JButton();
        alunoList = new JComboBox<>();
        materiaList = new JComboBox<>();
        DefaultListModel model = new DefaultListModel();

        t1 = new JLabel("Nome");
        t2 = new JLabel("Matérias disponíveis");

        matricular.setText("Matricular");
        matricular.setBounds(0, 0, 30, 15);

        janela.setMinimumSize(new Dimension(300, 300));
        janela.setLayout(new GridLayout(4, 2, 5, 5));

        for (int j = 0; j < Aluno.getAlunos().size(); j++) {
            model.addElement(Aluno.getAlunos().get(j).getNome());
            alunoList.addItem(Aluno.getAlunos().get(j).getNome());
        }

        for (int l = 0; l < b.getTurmas().size(); l++) {
            materiaList.addItem(b.getTurmas().get(l).getDisciplina());
        }

        alunosListJ = new JList<>(model);

        janela.getContentPane().add(t1);
        janela.getContentPane().add(t2);
        janela.getContentPane().add(new JScrollPane(alunosListJ));
        janela.getContentPane().add(materiaList);
        janela.getContentPane().add(matricular);

        alunosListJ.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        alunosListJ.setVisibleRowCount(5);

        materiaList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        matricular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i = materiaList.getSelectedIndex();

                int m = alunosListJ.getSelectedIndex();
                String s = alunosListJ.getSelectedValue();

                for (int z = 0; z < Aluno.getAlunos().size(); z++) {
                    if (Aluno.getAlunos().get(i).getNome().equals(m)) {

                        List<Aluno> matricular1 = b.getTurmas().get(i).matricular(Aluno.getAlunos().get(z));
                        String message = "Aluno:" + Aluno.getAlunos().get(z).getNome() + " matriculado em:" + b.getTurmas().get(z).getDisciplina();

                        JOptionPane.showMessageDialog(null, message, "Aluno cadastrado", JOptionPane.PLAIN_MESSAGE);
                    }
                }
                janela.dispose();
            }
        });

        janela.setVisible(true);
        janela.pack();
    }
}
