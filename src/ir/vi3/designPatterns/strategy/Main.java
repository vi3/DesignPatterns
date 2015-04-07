package ir.vi3.designPatterns.strategy;


public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setHeight(10);
        dog.setWeight(140);
        dog.setSound("Hop Hop");
        dog.setName("Rex");
        Animal cat = new Animal();
        cat.setName("kitty");
        cat.setHeight(12);
        cat.setWeight(30);
        cat.setSound("Miwo");
        System.out.println("dog name is " + dog.getName());
        System.out.println("cat name is " + cat.getName());
        Animal animal = new Cat();
        animal.tryTofly();
        animal.setFlyType(new ItCanNotFly());
        animal.tryTofly();
    }
}
