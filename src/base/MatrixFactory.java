package base;

public class MatrixFactory extends MathFactory {
    @Override
    public IMath createMath(Object size) {
        return new Matrix( size );
    }
}
