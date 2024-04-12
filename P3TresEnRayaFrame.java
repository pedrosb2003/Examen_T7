import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class P3TresEnRayaFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tres en raya");
        /*JPanel panel1 = new JPanel();*/

        ventana.setLayout(new GridLayout(3,3));
        /*panel1.setLayout(new BorderLayout());*/
        ventana.add(new JButton("1"));
        ventana.add(new JButton("2"));
        ventana.add(new JButton("3"));
        ventana.add(new JButton("4"));
        ventana.add(new JButton("5"));
        ventana.add(new JButton("6"));
        ventana.add(new JButton("7"));
        ventana.add(new JButton("8"));
        ventana.add(new JButton("9"));
        /*panel1.add(new Label("Turno de: "));

        ventana.add(panel1, BorderLayout.PAGE_END);*/

        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

}
