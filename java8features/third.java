package java8features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class demo4 implements Predicate<Integer>
{
    @Override
    public boolean test(Integer i)
    {
        return i%2==0;
    }
}
public class third {
    public static void main(String[] args) {
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Predicate<Integer> s = new demo4();
        Stream<Integer> s1 = l2.stream().filter(s);
        s1.forEach(System.out::println);
    }
}
