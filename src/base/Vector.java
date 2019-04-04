package base;

public class Vector implements IMath {

    private Integer[] params;

    @Override
    public Object getNumbers() {
        return getParams();
    }

    public Vector( Object temp)
    {
        params = ( Integer[] ) temp;
    }

    public Integer[] getParams()
    {
        return params;
    }
}
