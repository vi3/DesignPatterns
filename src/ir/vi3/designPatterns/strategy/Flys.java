package ir.vi3.designPatterns.strategy;

/**
 * Created by fedora20 on 4/1/15.
 */
public interface Flys {
     String fly();
}


class ItFlys implements Flys{

    @Override
    public String fly() {
        return "it can fly";
    }
}


class  ItCanNotFly implements Flys{

    @Override
    public String fly() {
        return "it can not fly";
    }
}

