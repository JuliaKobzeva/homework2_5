import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Маша");
        Human human2 = new Human("Cаша");
        Human human3 = new Human("Паша");
        Human human4 = new Human("Даша");
        Human human5 = new Human("Наташа");
        Human human6 = new Human("Света");
        Human human7 = new Human("Марина");
        Human human8 = new Human("Игорь");

        Supermarket<Human> supermarket = new Supermarket<>("супермаркет");

        supermarket.addHuman(human1);
        supermarket.addHuman(human2);
        supermarket.addHuman(human3);
        supermarket.addHuman(human4);
        supermarket.addHuman(human5);
        supermarket.addHuman(human6);
        supermarket.addHuman(human7);
        supermarket.addHuman(human8);

        supermarket.printInfo();

    }
}