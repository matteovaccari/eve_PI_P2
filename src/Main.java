import java.util.Scanner;

public class Main {

    static int biocells;
    static int constructionBlocks;
    static int consumerElectronics;
    static int coolant;
    static int enrichedUranium;
    static int fertilizer;
    static int geniticallyEnhancedLivestock;
    static int livestock;
    static int mechanicalParts;
    static int microfiberShielding;
    static int nanites;
    static int oxides;
    static int polyaramids;
    static int polyTextiles;
    static int rocketFuel;
    static int silicateGlass;
    static int superConductors;
    static int supertensilePlastics;
    static int synthethicOil;
    static int testCultures;
    static int transmitter;
    static int viralAgent;
    static int waterCooledCPU;
    static int miniatureElectronics;
    static int water;
    static int bacteria;
    static int reactiveMetals;


    public static void main(String args[]) {

    /*    System.out.println("Wetware mainframe?");
        Scanner scan = new Scanner(System.in);
        int wm = scan.nextInt();  */





    }

   public static void setWetwareAttributes(WetwareMainframe wetwareMainframe) {
       testCultures = testCultures + wetwareMainframe.getTestCultures();
       synthethicOil = synthethicOil + wetwareMainframe.getSyntheticOil();
       fertilizer = fertilizer + wetwareMainframe.getFertilizer();
       waterCooledCPU = waterCooledCPU + wetwareMainframe.getWaterCooledCpu();
       coolant = coolant + wetwareMainframe.getCoolant();
       consumerElectronics = consumerElectronics + wetwareMainframe.getConsumerElectronics();
       nanites = nanites + wetwareMainframe.getNanites();
       livestock = livestock + wetwareMainframe.getLivestock();
       constructionBlocks = constructionBlocks + wetwareMainframe.getConstructionBlocks();
   }

   public static void setSterileConduitsAttributes(SterileConduits sterileConduits) {
       constructionBlocks = constructionBlocks + sterileConduits.getConstructionBlocks();
       miniatureElectronics = miniatureElectronics + sterileConduits.getMiniatureElectronics();
       water = water + sterileConduits.getWater();
       livestock = livestock + sterileConduits.getLivestock();
       viralAgent = viralAgent + sterileConduits.getViralAgent();
   }

   public static void setSelfHarmonizingPowerCoreAttributes(SelfHarmonizingPowerCore selfHarmonizingPowerCore) {
       silicateGlass = silicateGlass + selfHarmonizingPowerCore.getSilicateGlass();
       rocketFuel = rocketFuel +  selfHarmonizingPowerCore.getRocketFuel();
       enrichedUranium = enrichedUranium + selfHarmonizingPowerCore.getEnrichedUranium();
       microfiberShielding = microfiberShielding + selfHarmonizingPowerCore.getMicrofiberShielding();
       polyaramids = polyaramids + selfHarmonizingPowerCore.getPolyaramids();
       geniticallyEnhancedLivestock = geniticallyEnhancedLivestock +  selfHarmonizingPowerCore.getGenetically_enhanced_livestock();
   }

   public static void setRecursiveComputingModuleAttributes(RecursiveComputingModule recursiveComputingModule) {
       supertensilePlastics = supertensilePlastics + recursiveComputingModule.getSupertensilPlastics();
       testCultures = testCultures +  recursiveComputingModule.getTestCultures();
       waterCooledCPU = waterCooledCPU + recursiveComputingModule.getWaterCooledCPU();
       transmitter = transmitter + recursiveComputingModule.getTransmitter();
       biocells = biocells + recursiveComputingModule.getBiocells();
       nanites = nanites + recursiveComputingModule.getNanites();
   }

   public static void setOrganicMortarApplicatorsAttributes(OrganicMortarApplicators organicMortarApplicator) {
       oxides = oxides +  organicMortarApplicator.getOxides();
       coolant = coolant + organicMortarApplicator.getCoolant();
       bacteria = bacteria + organicMortarApplicator.getBacteria();
       mechanicalParts = mechanicalParts + organicMortarApplicator.getMechanicalParts();
       consumerElectronics = consumerElectronics + organicMortarApplicator.getConsumerElectronics();
   }

   public static void setNanoFactoryAttributes(NanoFactory nanoFactory){
       fertilizer = fertilizer +  nanoFactory.getFertilizer();
       polyTextiles = polyTextiles + nanoFactory.getPolyTextiles();
       reactiveMetals = reactiveMetals + nanoFactory.getReactiveMetals();
       synthethicOil = synthethicOil + nanoFactory.getSynthethicOil();
       superConductors = superConductors + nanoFactory.getSuperConductors();
   }

   public static void setIntegrityDronesAttributes(IntegrityDrones integrityDrone) {
       supertensilePlastics = supertensilePlastics + integrityDrone.getSupertensilPlastics();
       mechanicalParts = mechanicalParts + integrityDrone.getMechanicalsParts();
       miniatureElectronics = miniatureElectronics + integrityDrone.getMiniatureElectronics();
       oxides = oxides + integrityDrone.getOxides();
       biocells = biocells + integrityDrone.getBiocells();
       superConductors = superConductors + integrityDrone.getSuperConductors();
       polyTextiles = polyTextiles + integrityDrone.getPolytextiles();
       viralAgent = viralAgent + integrityDrone.getViralAgent();
       transmitter = transmitter + integrityDrone.getTransmitter();
   }

   public static void setBroadcastNodeAttributes(BroadcastNode broadcastNode){
       supertensilePlastics = supertensilePlastics + broadcastNode.getSupertensilPlastics();
       microfiberShielding = microfiberShielding + broadcastNode.getMicrofiberShielding();
       polyaramids = polyaramids + broadcastNode.getPolyaramids();
       transmitter = transmitter + broadcastNode.getTransmitter();
       biocells = biocells + broadcastNode.getBiocells();
       silicateGlass = silicateGlass + broadcastNode.getSilicateGlass();
   }

   public static void instanciateP4Materials(int nbMWetWareMainframe, int nbIntegrityDrones, int nbSterileConduits,
                              int nbBroadcastNode, int nbNanoFactory, int nbOrganicMortarApplicators,
                              int nbRecursiveComputingModule, int nbSelfHarmonizingPowerCore){

       WetwareMainframe w1 = new WetwareMainframe(nbMWetWareMainframe);
       IntegrityDrones i1 = new IntegrityDrones(nbIntegrityDrones);
       SterileConduits s1 = new SterileConduits(nbSterileConduits);
       BroadcastNode b1 = new BroadcastNode(nbBroadcastNode);
       NanoFactory n1 = new NanoFactory(nbNanoFactory);
       OrganicMortarApplicators o1 = new OrganicMortarApplicators(nbOrganicMortarApplicators);
       RecursiveComputingModule r1 = new RecursiveComputingModule(nbRecursiveComputingModule);
       SelfHarmonizingPowerCore sh1 = new SelfHarmonizingPowerCore(nbSelfHarmonizingPowerCore);

       setWetwareAttributes(w1);
       setSterileConduitsAttributes(s1);
       setIntegrityDronesAttributes(i1);
       setBroadcastNodeAttributes(b1);
       setNanoFactoryAttributes(n1);
       setOrganicMortarApplicatorsAttributes(o1);
       setRecursiveComputingModuleAttributes(r1);
       setSelfHarmonizingPowerCoreAttributes(sh1);

   }

    public static String getBiocells() {
        return "Biocells x " + biocells;
    }

    public static String getConstructionBlocks() {
        return "Construction Blocks x " + constructionBlocks;
    }

    public static String getConsumerElectronics() {
        return "Consumer Electronics x " + consumerElectronics;
    }

    public static String getCoolant() {
        return "Coolant x " + coolant;
    }

    public static String getEnrichedUranium() {
        return "Enriched Uranium x " + enrichedUranium;
    }

    public static String getFertilizer() {
        return "Fertilizer x " + fertilizer ;
    }

    public static String getGeniticallyEnhancedLivestock() {
        return "Genetically Enhanced Livestock x " + geniticallyEnhancedLivestock;
    }

    public static String getLivestock() {
        return "Livestock x " + livestock;
    }

    public static String getMechanicalParts() {
        return "Mechanical Parts x " + mechanicalParts;
    }

    public static String getMicrofiberShielding() {
        return "Microfiber Shielding x " + microfiberShielding;
    }

    public static String getNanites() {
        return "Nanites x " + nanites;
    }

    public static String getOxides() {
        return "Oxides x " + oxides;
    }

    public static String getPolyaramids() {
        return "Polyaramids x " + polyaramids;
    }

    public static String getPolyTextiles() {
        return "Polytextiles x " + polyTextiles ;
    }

    public static String getRocketFuel() {
        return "Rocket Fuel x " + rocketFuel ;
    }

    public static String getSilicateGlass() {
        return "Silicate Glass x " + silicateGlass;
    }

    public static String getSuperConductors() {
        return  "Superconductors x " + superConductors;
    }

    public static String getSupertensilePlastics() {
        return "Supertensile Plastics x " + supertensilePlastics;
    }

    public static String getSynthethicOil() {
        return "Synthetic Oil x " + synthethicOil;
    }

    public static String getTestCultures() {
        return "Test Cultures x " + testCultures;
    }

    public static String getTransmitter() {
        return "Transmitter x " + transmitter;
    }

    public static String getViralAgent() {
        return  "Viral Agent x " + viralAgent;
    }

    public static String getWaterCooledCPU() {
        return "Water-Cooled CPU x " + waterCooledCPU;
    }

    public static String getMiniatureElectronics() {
        return  "Miniature Electronics x " + miniatureElectronics;
    }

    public static String getWater() {
        return "Water x " + water;
    }

    public static String getBacteria() {
        return "Bacteria x " + bacteria;
    }

    public static String getReactiveMetals() {
        return "Reactive Metals x " + reactiveMetals;
    }
}
