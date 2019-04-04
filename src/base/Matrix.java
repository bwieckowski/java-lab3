package base;

public class Matrix implements IMath {

    private Integer[][] params;

    @Override
    public Object getNumbers() {
        return getParams();
    }

    public Matrix( Object temp)
    {
        params = ( Integer[][] ) temp;
    }

    public Integer[][] getParams()
    {
        return params;
    }
}
