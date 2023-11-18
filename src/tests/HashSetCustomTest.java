package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wtf.HashSetCustom;

import java.util.ArrayList;
import java.util.Arrays;

public class HashSetCustomTest {

    @Test
    public void testAdd() {
        HashSetCustom<Integer> set = new HashSetCustom<>();
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(10);

        var iterator = set.iterator();
        var array1 = new Integer[set.size()];
        for (int i = 0; i < set.size(); i++) {
            array1[i] = iterator.next();
        }

        Assert.assertArrayEquals(
                new Integer[]{2, 4, 5, 10}, Arrays.stream(array1).sorted().toArray()
        );

        set.add(4);

        var iterator2 = set.iterator();
        var array2 = new Integer[set.size()];
        for (int i = 0; i < set.size(); i++) {
            array2[i] = iterator2.next();
        }

        Assert.assertArrayEquals(
                new Integer[]{2, 4, 5, 10}, Arrays.stream(array2).sorted().toArray()
        );

    }

    @Test
    public void testRemove() {
        HashSetCustom<Integer> set = new HashSetCustom<>();
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(10);

        set.remove(4);

        var iterator = set.iterator();
        var array1 = new Integer[set.size()];
        for (int i = 0; i < set.size(); i++) {
            array1[i] = iterator.next();
        }

        Assert.assertArrayEquals(
                new Integer[]{2, 5, 10}, Arrays.stream(array1).sorted().toArray()
        );
    }
}