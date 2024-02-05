package pattern.creational.factory.method.creator;

import design.pattern.creational.factory.method.product.ArtDecor;
import design.pattern.creational.factory.method.product.Chair;

public class ArtDecorCreator implements ChairCreator{
    @Override
    public Chair createChair(Integer numberOfLegs, Integer numberOfHands) {
        return new ArtDecor(numberOfLegs, numberOfHands);
    }
}
