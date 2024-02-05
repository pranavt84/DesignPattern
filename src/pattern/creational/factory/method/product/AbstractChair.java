package pattern.creational.factory.method.product;

public abstract class AbstractChair implements Chair{

    private Integer numberOfLegs;
    private Integer numberOfHands;
    AbstractChair(Integer numberOfLegs, Integer numberOfHands) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfHands = numberOfHands;
    }


}
