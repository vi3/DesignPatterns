package ir.vi3.designPatterns.strategy;

/**
 * Created by fedora20 on 4/1/15.
 */
public class Animal {
    private String Name;
    private int weight;
    private int height;
    private String sound;
    public Flys flyType;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFlyType(Flys flyType) {
        this.flyType = flyType;
    }

    public void tryTofly(){
        System.out.println(flyType.fly());
    }


}
