package ir.vi3.designPatterns.strategy;

/**
 * Created by fedora20 on 4/1/15.
 */
public class Cat extends Animal {

    public Cat() {
        setName("Cat");
        setFlyType(new ItFlys());
    }
}


