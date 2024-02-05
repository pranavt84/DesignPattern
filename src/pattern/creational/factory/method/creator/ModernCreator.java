package pattern.creational.factory.method.creator;

import design.pattern.creational.factory.method.product.ArtDecor;
import design.pattern.creational.factory.method.product.Chair;
import design.pattern.creational.factory.method.product.Modern;

public class ModernCreator implements ChairCreator {
    @Override
    public Chair createChair(Integer numberOfLegs, Integer numberOfHands) {
        return new Modern(numberOfLegs, numberOfHands);
    }
}
