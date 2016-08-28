package me.aslam.khurram.ds;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListTest {

    private static final int INITIAL_CAPACITY = 10;

    @Test
    public void testAdd() throws Exception {
        IList<Integer> myList = new List<>(INITIAL_CAPACITY);
        assertEquals("List should be empty before adding", true, myList.isEmpty());
        for (int i=0; i<20; i++) {
            myList.add(i);
        }
        myList.remove(12);
        assertEquals("List should not be empty", false, myList.isEmpty());
        System.out.println(myList.size());
    }

}
