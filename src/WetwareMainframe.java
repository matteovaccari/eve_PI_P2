public class WetwareMainframe {
    public WetwareMainframe(int nb) {
        this.testCultures = 20 * nb;
        this.syntheticOil = 20 * nb;
        this.fertilizer = 20 * nb;
        this.waterCooledCpu = 20 * nb;
        this.coolant = 20 * nb;
        this.consumerElectronics = 20 * nb;
        this.nanites = 20 * nb;
        this.livestock = 20 * nb;
        this.constructionBlocks = 20 * nb;
        this.nb = nb;
    }

    int testCultures;
    int syntheticOil;
    int fertilizer;
    int waterCooledCpu;
    int coolant;
    int consumerElectronics;
    int nanites;
    int livestock;
    int constructionBlocks;
    int nb;

    public int getTestCultures() {
        return this.testCultures;
    }

    public int getSyntheticOil() {
        return this.syntheticOil;
    }

    public int getFertilizer() {
        return this.fertilizer;
    }

    public int getWaterCooledCpu() {
        return this.waterCooledCpu;
    }

    public int getCoolant() {
        return this.coolant;
    }

    public int getConsumerElectronics() {
        return this.consumerElectronics;
    }

    public int getNanites() {
        return this.nanites;
    }

    public int getLivestock() {
        return this.livestock;
    }

    public int getConstructionBlocks() {
        return this.constructionBlocks;
    }

    public int getNb() {
        return this.nb;
    }
}
