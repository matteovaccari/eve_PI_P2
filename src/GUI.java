import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    JLabel label;
    JButton button;
    JPanel panel;
    JTextField textField;

    public GUI() {
        window = new JFrame("Eve pi P2->P4");
        window.setVisible(true);
        window.setSize(600,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        button = new JButton("Calcul");
        button.addActionListener(this);

      //  textField = new JTextField("test");

        label = new JLabel("Click to see results");

        panel.add(button);
        panel.add(label);
     //   panel.add(textField);

        window.add(panel);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.instanciateP4Materials(1, 0, 1, 5,
                2, 3, 5, 6);
        label.setText("<html>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getConstructionBlocks() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>"
                + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + Main.getBacteria() + "<br/>" + Main.getBiocells() + "<br/>" + "</html>");

    }


}
