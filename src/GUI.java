import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    JLabel result_label;
    JLabel wetWareMainFrame_label;
    JLabel broadCastNode_label;
    JLabel integrityDrones_label;
    JLabel nanoFactory_label;
    JLabel organicMortarApplicators_label;
    JLabel recursiveComputingModule_label;
    JLabel selfHarmonizingModule_label;
    JLabel sterileConduits_label;
    JButton button;
    JPanel panel;
    JTextField wetWareMainFrame_textField;
    JTextField broadcastNode_textField;
    JTextField integrityDrones_textField;
    JTextField nanoFactory_textField;
    JTextField organicMortarApplicators_textField;
    JTextField recursiveComputingModule_textField;
    JTextField selfHarmonizingPowerCore_textField;
    JTextField sterileConduits_textField;

    public GUI() {
        window = new JFrame("Eve pi P2->P4");
        window.setVisible(true);
        window.setSize(600,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        button = new JButton("Calcul");
        button.addActionListener(this);

        wetWareMainFrame_textField = new JTextField("0", 3);
        broadcastNode_textField = new JTextField("0",3);
        integrityDrones_textField = new JTextField("0",3);
        nanoFactory_textField = new JTextField("0",3);
        organicMortarApplicators_textField = new JTextField("0",3);
        recursiveComputingModule_textField = new JTextField("0",3);
        selfHarmonizingPowerCore_textField = new JTextField("0",3);
        sterileConduits_textField = new JTextField("0",3);

        result_label = new JLabel("Click to see results");
        wetWareMainFrame_label = new JLabel("WetWare Mainframe ?");
        broadCastNode_label = new JLabel("Broadcast Node ?");
        integrityDrones_label = new JLabel("Integrity Response Drones ?");
        nanoFactory_label = new JLabel("Nano-Factory");
        organicMortarApplicators_label = new JLabel("Organic Mortar Applicators ?");
        recursiveComputingModule_label = new JLabel("Recursive Computing Module ?");
        selfHarmonizingModule_label = new JLabel("Self-Harmonizing Module ?");
        sterileConduits_label = new JLabel("Sterile Conduits ?");

        panel.add(wetWareMainFrame_label);
        panel.add(wetWareMainFrame_textField);
        panel.add(broadCastNode_label);
        panel.add(broadcastNode_textField);
        panel.add(integrityDrones_label);
        panel.add(integrityDrones_textField);
        panel.add(nanoFactory_label);
        panel.add(nanoFactory_textField);
        panel.add(organicMortarApplicators_label);
        panel.add(organicMortarApplicators_textField);
        panel.add(recursiveComputingModule_label);
        panel.add(recursiveComputingModule_textField);
        panel.add(selfHarmonizingModule_label);
        panel.add(selfHarmonizingPowerCore_textField);
        panel.add(sterileConduits_label);
        panel.add(sterileConduits_textField);
        panel.add(button);
        panel.add(result_label);

        window.add(panel);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int nbWetWare = Integer.parseInt(wetWareMainFrame_textField.getText());
        int nbBroadcastNode = Integer.parseInt(broadcastNode_textField.getText());
        int nbIntegrityDrones = Integer.parseInt(integrityDrones_textField.getText());
        int nbNanoFactory = Integer.parseInt(nanoFactory_textField.getText());
        int nbOrganicMortarsApplicators = Integer.parseInt(organicMortarApplicators_textField.getText());
        int nbRecursiveComputingModule = Integer.parseInt(recursiveComputingModule_textField.getText());
        int nbSelfHarmonizingPowerCore = Integer.parseInt(selfHarmonizingPowerCore_textField.getText());
        int nbSterileConduits = Integer.parseInt(sterileConduits_textField.getText());

        Main.instanciateP4Materials(nbWetWare, nbIntegrityDrones, nbSterileConduits, nbBroadcastNode,
                nbNanoFactory, nbOrganicMortarsApplicators, nbRecursiveComputingModule, nbSelfHarmonizingPowerCore);
        result_label.setText("<html>" + Main.getBiocells() + "<br/>" + Main.getConstructionBlocks() + "<br/>"
                + Main.getConsumerElectronics() + "<br/>" + Main.getCoolant() + "<br/>" + Main.getEnrichedUranium() + "<br/>" + Main.getFertilizer() + "<br/>"
                + Main.getGeniticallyEnhancedLivestock() + "<br/>" + Main.getLivestock() + "<br/>" + Main.getMechanicalParts() + "<br/>" + Main.getMicrofiberShielding() + "<br/>"
                + Main.getNanites() + "<br/>" + Main.getOxides() + "<br/>" + Main.getPolyaramids() + "<br/>" + Main.getPolyTextiles() + "<br/>"
                + Main.getRocketFuel() + "<br/>" + Main.getSilicateGlass() + "<br/>" + Main.getSuperConductors() + "<br/>" + Main.getSupertensilePlastics() + "<br/>"
                + Main.getSynthethicOil() + "<br/>" + Main.getTestCultures() + "<br/>" + Main.getTransmitter() + "<br/>" + Main.getViralAgent() + "<br/>"
                + Main.getWaterCooledCPU() + "<br/>" + Main.getMiniatureElectronics() + "<br/>" + Main.getWater() + "<br/>" + Main.getBacteria() + "<br/>"
                + Main.getReactiveMetals()+ "<br/>" + "</html>");
            //to do : reset main.attri
    }


}
