public class SelfHarmonizingPowerCore {
    public SelfHarmonizingPowerCore(int nb) {
        this.silicateGlass = 20 * nb;
        this.rocketFuel = 20 * nb;
        this.enrichedUranium = 20 * nb;
        this.microfiberShielding = 20 * nb;
        this.polyaramids = 20 * nb;
        this.genetically_enhanced_livestock = 20 * nb;
        this.nb = nb;
    }
    int silicateGlass;
    int rocketFuel;
    int enrichedUranium;
    int microfiberShielding;
    int polyaramids;
    int genetically_enhanced_livestock;
    int nb;

    public int getSilicateGlass() {
        return silicateGlass;
    }

    public int getRocketFuel() {
        return rocketFuel;
    }

    public int getEnrichedUranium() {
        return enrichedUranium;
    }

    public int getMicrofiberShielding() {
        return microfiberShielding;
    }

    public int getPolyaramids() {
        return polyaramids;
    }

    public int getGenetically_enhanced_livestock() {
        return genetically_enhanced_livestock;
    }

    public int getNb() {
        return nb;
    }
}
