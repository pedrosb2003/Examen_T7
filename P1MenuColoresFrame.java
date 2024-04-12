import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1MenuColoresFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Menu Colores");
        JPanel panel1 = new JPanel();

        JMenuBar menuBar = new JMenuBar();
        JMenu menuColores = new JMenu("Colores");

        JMenuItem rojo = new JMenuItem("Rojo");
        JMenuItem verde = new JMenuItem("Verde");
        JMenuItem azul = new JMenuItem("Azul");
        JMenuItem salir = new JMenuItem("Salir");

        menuColores.add(rojo);
        menuColores.add(verde);
        menuColores.add(azul);
        menuColores.addSeparator();
        menuColores.add(salir);

        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(Color.red);
            }
        });

        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(Color.green);
            }
        });

        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setBackground(Color.blue);
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(menuColores);
        ventana.setJMenuBar(menuBar);
        ventana.add(panel1);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
