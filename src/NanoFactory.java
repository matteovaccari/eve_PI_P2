public class NanoFactory {

    public NanoFactory(int nb) {
        this.fertilizer = 20 * nb;
        this.polyTextiles = 20 * nb;
        this.reactiveMetals = 40 * nb;
        this.synthethicOil = 20 * nb;
        this.superConductors = 20 * nb;
        this.nb = nb;
    }
    int fertilizer;
    int polyTextiles;
    int reactiveMetals;
    int synthethicOil;
    int superConductors;
    int nb;

    public int getFertilizer() {
        return fertilizer;
    }

    public int getPolyTextiles() {
        return polyTextiles;
    }

    public int getReactiveMetals() {
        return reactiveMetals;
    }

    public int getSynthethicOil() {
        return synthethicOil;
    }

    public int getSuperConductors() {
        return superConductors;
    }

    public int getNb() {
        return nb;
    }
}
