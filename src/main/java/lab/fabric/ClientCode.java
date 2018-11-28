package lab.fabric;

public class ClientCode {
    public static void main(String[] args) {
        Human human = BioReactor.getHuman("SuperHero");
        human.speak();
    }
}
