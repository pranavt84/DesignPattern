package pattern.creational.factory.method.creator;

import design.pattern.creational.factory.method.product.Chair;

public interface ChairCreator {
    public Chair createChair(Integer numberOfLegs, Integer numberOfHands);
}
