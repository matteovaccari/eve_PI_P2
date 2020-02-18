public class BroadcastNode {

    public BroadcastNode(int nb) {
        this.supertensilPlastics = 20 * nb;
        this.microfiberShielding = 20 * nb;
        this.polyaramids = 20 * nb;
        this.transmitter = 20 * nb;
        this.biocells = 20 * nb;
        this.silicateGlass = 20 * nb;
        this.nb = nb;
    }
    int supertensilPlastics;
    int microfiberShielding;
    int polyaramids;
    int transmitter;
    int biocells;
    int silicateGlass;
    int nb;

    public int getSupertensilPlastics() {
        return supertensilPlastics;
    }

    public int getMicrofiberShielding() {
        return microfiberShielding;
    }

    public int getPolyaramids() {
        return polyaramids;
    }

    public int getTransmitter() {
        return transmitter;
    }

    public int getBiocells() {
        return biocells;
    }

    public int getSilicateGlass() {
        return silicateGlass;
    }

    public int getNb() {
        return nb;
    }
}
