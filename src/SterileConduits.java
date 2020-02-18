public class SterileConduits {
    public SterileConduits(int nb) {
        this.constructionBlocks = 20 * nb;
        this.miniatureElectronics = 20 * nb;
        this.water = 40 * nb;
        this.livestock = 20 * nb;
        this.viralAgent = 20 * nb;
        this.nb = nb;
    }
    int constructionBlocks;
    int miniatureElectronics;
    int water;
    int livestock;
    int viralAgent;
    int nb;

    public int getConstructionBlocks() {
        return constructionBlocks;
    }

    public int getMiniatureElectronics() {
        return miniatureElectronics;
    }

    public int getWater() {
        return water;
    }

    public int getLivestock() {
        return livestock;
    }

    public int getViralAgent() {
        return viralAgent;
    }

    public int getNb() {
        return nb;
    }
}
