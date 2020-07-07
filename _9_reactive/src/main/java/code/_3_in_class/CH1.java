package code._3_in_class;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CH1 {
    public void consumer1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Consumer<List<String>> consumer = l -> l.clear();
        consumer.accept(list);
    }
    public void consumer2(){
        List<String>list1 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String>list2 = new ArrayList<>(Arrays.asList("a","b","c" , "first" , "second"));

        Consumer<List<String>>c1= l -> l.add("first");
        Consumer<List<String>>c2= l -> l.add("second");

        Consumer<List<String>>c3= c1.andThen(c2);

        List<String> list;
        c3.accept(list);

        Assert.assertEquals(list ,list2);
    }
}
