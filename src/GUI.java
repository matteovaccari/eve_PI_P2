import javax.swing.*;
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
        window.setSize(280,700);
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

        result_label = new JLabel("<html>Click to see results" + "<br/>" + "You have to put 0 and not let fields empty</html>");
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
        window.validate();
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

        P2toP4.instanciateP4Materials(nbWetWare, nbIntegrityDrones, nbSterileConduits, nbBroadcastNode,
                nbNanoFactory, nbOrganicMortarsApplicators, nbRecursiveComputingModule, nbSelfHarmonizingPowerCore);
        result_label.setText("<html>" + P2toP4.getBiocells() + "<br/>" + P2toP4.getConstructionBlocks() + "<br/>"
                + P2toP4.getConsumerElectronics() + "<br/>" + P2toP4.getCoolant() + "<br/>" + P2toP4.getEnrichedUranium() + "<br/>" + P2toP4.getFertilizer() + "<br/>"
                + P2toP4.getGeniticallyEnhancedLivestock() + "<br/>" + P2toP4.getLivestock() + "<br/>" + P2toP4.getMechanicalParts() + "<br/>" + P2toP4.getMicrofiberShielding() + "<br/>"
                + P2toP4.getNanites() + "<br/>" + P2toP4.getOxides() + "<br/>" + P2toP4.getPolyaramids() + "<br/>" + P2toP4.getPolyTextiles() + "<br/>"
                + P2toP4.getRocketFuel() + "<br/>" + P2toP4.getSilicateGlass() + "<br/>" + P2toP4.getSuperConductors() + "<br/>" + P2toP4.getSupertensilePlastics() + "<br/>"
                + P2toP4.getSynthethicOil() + "<br/>" + P2toP4.getTestCultures() + "<br/>" + P2toP4.getTransmitter() + "<br/>" + P2toP4.getViralAgent() + "<br/>"
                + P2toP4.getWaterCooledCPU() + "<br/>" + P2toP4.getMiniatureElectronics() + "<br/>" + P2toP4.getWater() + "<br/>" + P2toP4.getBacteria() + "<br/>"
                + P2toP4.getReactiveMetals()+ "<br/>" + "</html>");

        P2toP4.reset();
    }


}
