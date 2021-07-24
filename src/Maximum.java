public class Maximum<T extends  Comparable<T>> {
    T x,y,z;

    public Maximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public static <T extends Comparable<T> > T max(T x, T y, T z)
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
        printMax(x,y,z,max);
        return max;
    }
    public static <T> void printMax(T x,T y,T z,T max)
    {
        System.out.printf("Max of %s,%s and %s is %s:",x,y,z,max);
    }


    public static void main(String[] args) {
        Integer x=10,y=11,z=2;
        Maximum.max(x,y,z);
        Float p=2.2f,q=1.2f,r=5.2f;
        Maximum.max(p,q,r);
        String d="abc",e="pune",f="Mumbai";
        Maximum.max(d,e,f);



    }
}
