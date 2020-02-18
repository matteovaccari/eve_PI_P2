public class OrganicMortarApplicators {

    public OrganicMortarApplicators(int nb) {
        this.oxides = 20 * nb;
        this.coolant = 20 * nb;
        this.bacteria = 40 * nb;
        this.mechanicalParts = 20 * nb;
        this.consumerElectronics = 20 * nb;
        this.nb = nb;
    }
    int oxides;
    int coolant;
    int bacteria;
    int mechanicalParts;
    int consumerElectronics;
    int nb;

    public int getOxides() {
        return oxides;
    }

    public int getCoolant() {
        return coolant;
    }

    public int getBacteria() {
        return bacteria;
    }

    public int getMechanicalParts() {
        return mechanicalParts;
    }

    public int getConsumerElectronics() {
        return consumerElectronics;
    }

    public int getNb() {
        return nb;
    }
}
