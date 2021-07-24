public class Maximum {
    public static <T extends Comparable<T> > T max(T x,T y, T z)
    {
        T max =x;
        if(y.compareTo(max)>0)
        {
            max=y;
        }
        if(z.compareTo(max)>0)
        {
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer x=10,y=11,z=2;
        System.out.println(Maximum.max(x,y,z));
    }
}
