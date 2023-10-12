import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class InterfazBiblioteca {
    private JTextField onichan;
    private JButton ingresarALaBibliotecaButton;
    private JButton buscarLibroButton;
    private JButton eliminarLibroButton;
    private JPanel ventana;
    private JButton sacarLibroButton;
    private JButton mostrarLibrosButton;
    private JTextArea textArea1;
    private biblioteca libros = new biblioteca();

    public static void main(String[] args) {
        JFrame frame = new JFrame("InterfazBiblioteca");
        frame.setContentPane(new InterfazBiblioteca().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public InterfazBiblioteca() {
    ingresarALaBibliotecaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            libros.apilarLibro(onichan.getText());
            JOptionPane.showMessageDialog(null,"hay "+libros.cantidadDeLibros()+" libros en la biblioteca");

        }
    });

        sacarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                libros.borrarLibro(onichan.getText());

            }
        });
        mostrarLibrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(libros.toString());

            }
        });
        buscarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, libros.buscarElemento(textArea1.getText()));

                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
