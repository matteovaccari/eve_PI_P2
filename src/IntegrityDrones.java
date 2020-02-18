public class IntegrityDrones {

    public IntegrityDrones(int nb) {
        this.supertensilPlastics = 20 * nb;
        this.mechanicalsParts = 20 * nb;
        this.miniatureElectronics = 20 * nb;
        this.oxides = 20 * nb;
        this.biocells = 20 * nb;
        this.superConductors = 20 * nb;
        this.polytextiles = 20 * nb;
        this.viralAgent = 20 * nb;
        this.transmitter = 20 * nb;
        this.nb = nb;
    }

    int supertensilPlastics;
    int mechanicalsParts;
    int miniatureElectronics;
    int oxides;
    int biocells;
    int superConductors;
    int polytextiles;
    int viralAgent;
    int transmitter;
    int nb;

    public int getSupertensilPlastics() {
        return supertensilPlastics;
    }

    public int getMechanicalsParts() {
        return mechanicalsParts;
    }

    public int getMiniatureElectronics() {
        return miniatureElectronics;
    }

    public int getOxides() {
        return oxides;
    }

    public int getBiocells() {
        return biocells;
    }

    public int getSuperConductors() {
        return superConductors;
    }

    public int getPolytextiles() {
        return polytextiles;
    }

    public int getViralAgent() {
        return viralAgent;
    }

    public int getTransmitter() {
        return transmitter;
    }

    public int getNb() {
        return this.nb;
    }
}
