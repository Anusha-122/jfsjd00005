package java8features;
import java.util.Arrays;
import java.util.List;
//import java.util.function.Fumction;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

class a1 implements BinaryOperator< Integer>
{
    public Integer apply(Integer i,Integer j)
    {
        return i+j;
    }
}

public class fourth {
    public static void main(String[] args)
    {
        List<Integer> l4= Arrays.asList(1,2,3,4,5,6,7);
        BinaryOperator<Integer> b1=new a1();
        int n1=l4.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j);
        System.out.println(n1);
    }
}
