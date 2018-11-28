package lab.fabric;

public class BioReactor {
    public static Human getHuman(String type){
        if (type.equals("SuperHero")){
            return new SuperHero();
        } else {
            return null;
        }
    }
}
