package base;

public class VectorFactory extends MathFactory {
    @Override
    public IMath createMath(Object size) {
        return new Vector( size );
    }
}
