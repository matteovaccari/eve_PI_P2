public class RecursiveComputingModule {
    public RecursiveComputingModule(int nb) {
        this.supertensilPlastics = 20 * nb;
        this.testCultures = 20 * nb;
        this.waterCooledCPU = 20 * nb;
        this.transmitter = 20 * nb;
        this.biocells = 20 * nb;
        this.nanites = 20 * nb;
        this.nb = nb;
    }
    int supertensilPlastics;
    int testCultures;
    int waterCooledCPU;
    int transmitter;
    int biocells;
    int nanites;
    int nb;

    public int getSupertensilPlastics() {
        return supertensilPlastics;
    }

    public int getTestCultures() {
        return testCultures;
    }

    public int getWaterCooledCPU() {
        return waterCooledCPU;
    }

    public int getTransmitter() {
        return transmitter;
    }

    public int getBiocells() {
        return biocells;
    }

    public int getNanites() {
        return nanites;
    }

    public int getNb() {
        return nb;
    }
}
