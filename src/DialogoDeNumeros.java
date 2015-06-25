import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class DialogoDeNumeros extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;
    private JTable table2;
    private JTable table3;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JFormattedTextField formattedTextField4;

    final static Color ERROR_COLOR = Color.red;
    final static Color RIGHT_COLOR = Color.green;

    public DialogoDeNumeros() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        int mtrz1fil = 0;
        int mtrz1col = 0;
        int mtrz2fil = 0;
        int mtrz2col = 0;

        try {
            mtrz1fil = Integer.parseInt(formattedTextField1.getText());
        } catch (NumberFormatException e) {formattedTextField1.setBackground(ERROR_COLOR);}
        try {
            mtrz1col = Integer.parseInt(formattedTextField2.getText());
        } catch (NumberFormatException e) {formattedTextField2.setBackground(ERROR_COLOR);}
        try {
            mtrz2fil = Integer.parseInt(formattedTextField3.getText());
        } catch (NumberFormatException e) {formattedTextField3.setBackground(ERROR_COLOR);}
        try {
            mtrz2col = Integer.parseInt(formattedTextField4.getText());
        } catch (NumberFormatException e) {formattedTextField4.setBackground(ERROR_COLOR);}

        if (Validador.Entrada(mtrz1fil)) {
            formattedTextField1.setBackground(RIGHT_COLOR);
        }else  formattedTextField1.setBackground((ERROR_COLOR));

        if (Validador.Entrada(mtrz1col)) {
            formattedTextField2.setBackground(RIGHT_COLOR);
        }else  formattedTextField2.setBackground((ERROR_COLOR));

        if (Validador.Entrada(mtrz2fil)) {
            formattedTextField3.setBackground(RIGHT_COLOR);
        }else  formattedTextField3.setBackground((ERROR_COLOR));

        if (Validador.Entrada(mtrz2col)) {
            formattedTextField4.setBackground(RIGHT_COLOR);
        }else  formattedTextField4.setBackground((ERROR_COLOR));

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        formattedTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
    }

    private void onOK() {
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        DialogoDeNumeros dialog = new DialogoDeNumeros();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}