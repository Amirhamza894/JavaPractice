package ChainInheretance;

public class letTest {
    public static void main(String[] args) {
        Women human = new Women();
        human.setName("Amir");
        human.setGender("Male");
        human.setLifeStatus("Alive");

        System.out.println(human.getName());
        System.out.println(human.getGender());
        System.out.println(human.getLifeStatus());

    }
}
