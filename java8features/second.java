package java8features;

import java.util.function.Consumer;


class demo6 implements Consumer<Integer>
{
    @Override
    public void accept(Integer i)
    {
        System.out.println(i);
    }

}
public class second {
    public static void main(String[] args){
        Consumer<Integer> consumer = new demo6();
        consumer.accept(6);

    }
}
