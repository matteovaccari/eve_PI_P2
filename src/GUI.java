import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    JLabel result_label;
    JLabel wetWare_MainFrame_label;
    JButton button;
    JPanel panel;
    JTextField wetWare_MainFrame_textField;

    public GUI() {
        window = new JFrame("Eve pi P2->P4");
        window.setVisible(true);
        window.setSize(600,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        button = new JButton("Calcul");
        button.addActionListener(this);

        wetWare_MainFrame_textField = new JTextField("test", 10);

        result_label = new JLabel("Click to see results");
        wetWare_MainFrame_label = new JLabel("WetWare Mainframe ?");

        panel.add(wetWare_MainFrame_label);
        panel.add(wetWare_MainFrame_textField);
        panel.add(button);
        panel.add(result_label);

        window.add(panel);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int nbWetWare = Integer.parseInt(wetWare_MainFrame_textField.getText());
        Main.instanciateP4Materials(nbWetWare, 0, 0, 0,
                0, 0, 0, 0);
        result_label.setText("<html>" + Main.getBiocells() + "<br/>" + Main.getConstructionBlocks() + "<br/>"
                + Main.getConsumerElectronics() + "<br/>" + Main.getCoolant() + "<br/>" + Main.getEnrichedUranium() + "<br/>" + Main.getFertilizer() + "<br/>"
                + Main.getGeniticallyEnhancedLivestock() + "<br/>" + Main.getLivestock() + "<br/>" + Main.getMechanicalParts() + "<br/>" + Main.getMicrofiberShielding() + "<br/>"
                + Main.getNanites() + "<br/>" + Main.getOxides() + "<br/>" + Main.getPolyaramids() + "<br/>" + Main.getPolyTextiles() + "<br/>"
                + Main.getRocketFuel() + "<br/>" + Main.getSilicateGlass() + "<br/>" + Main.getSuperConductors() + "<br/>" + Main.getSupertensilePlastics() + "<br/>"
                + Main.getSynthethicOil() + "<br/>" + Main.getTestCultures() + "<br/>" + Main.getTransmitter() + "<br/>" + Main.getViralAgent() + "<br/>"
                + Main.getWaterCooledCPU() + "<br/>" + Main.getMiniatureElectronics() + "<br/>" + Main.getWater() + "<br/>" + Main.getBacteria() + "<br/>"
                + Main.getReactiveMetals()+ "<br/>"+ "</html>");
            //to do : reset main.attri
    }


}
