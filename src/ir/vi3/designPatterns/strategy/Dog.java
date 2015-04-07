package ir.vi3.designPatterns.strategy;

/**
 * Created by fedora20 on 4/1/15.
 */
public class Dog extends Animal{
    public Dog() {
        setName("dog");
        setFlyType(new ItCanNotFly());

    }
    public void digHole(){
        System.out.println("dug a hole");
    }
}

