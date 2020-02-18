import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JLabel label;

    public GUI(){
    JFrame frame = new JFrame();

    JButton button = new JButton("Calcul");
    button.addActionListener(this);

    label = new JLabel("Click to see results");

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100,100));
    panel.setLayout(new GridLayout(0 ,1));
    panel.add(button);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("PI P2 materials needed for P4");
    frame.pack();
    frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.instanciateP4Materials(1,0,1,5,
                2,3,5,6);
        label.setText(Main.getTotalRessourcesNeeded());

    }


}
