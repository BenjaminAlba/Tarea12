package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void ListIsEmptyWhenCreated(){
        ArrayList<Integer> list = new ArrayList<>();

        int size = list.getSize();

        assertEquals(0,size);
    }

    @Test
    public void SizeGrowsWhenAddingElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);

        assertEquals(1,list.getSize());
        assertEquals(5,list.get(0));
    }

    @Test
    public void SizeGrowsBeyondLimitWhenAddingElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        list.add(25);

        assertEquals(5,list.getSize());
        assertEquals(5,list.get(0));
        assertEquals(10,list.get(1));
        assertEquals(15,list.get(2));
        assertEquals(20,list.get(3));
        assertEquals(25,list.get(4));
    }

    @Test
    public void TraversingAllElementsWithIterator(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        Iterator<Integer> it = list.getIterator();

        assertTrue(it.hasNext());
        assertEquals(5,it.next());
        assertTrue(it.hasNext());
        assertEquals(10,it.next());
        assertTrue(it.hasNext());
        assertEquals(15,it.next());
        assertTrue(it.hasNext());
        assertEquals(20,it.next());
        assertTrue(it.hasNext());
        assertEquals(25,it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void TraversingAllElementsWithReverseIterator(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        Iterator<Integer> it = list.getReverseIterator();

        assertTrue(it.hasNext());
        assertEquals(25,it.next());
        assertTrue(it.hasNext());
        assertEquals(20,it.next());
        assertTrue(it.hasNext());
        assertEquals(15,it.next());
        assertTrue(it.hasNext());
        assertEquals(10,it.next());
        assertTrue(it.hasNext());
        assertEquals(5,it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void SizeDecreasesWhenDeletingFirstElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        list.delete(0);

        assertEquals(3,list.getSize());
        assertEquals(10,list.get(0));
        assertEquals(15,list.get(1));
        assertEquals(20,list.get(2));
    }

    @Test
    public void SizeDecreasesWhenDeletingMiddleElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        list.delete(1);

        assertEquals(3,list.getSize());
        assertEquals(5,list.get(0));
        assertEquals(15,list.get(1));
        assertEquals(20,list.get(2));
    }

    @Test
    public void SizeDecreasesWhenDeletingLastElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        list.delete(3);

        assertEquals(3,list.getSize());
        assertEquals(5,list.get(0));
        assertEquals(10,list.get(1));
        assertEquals(15,list.get(2));
    }

    @Test
    public void MyIndexOutOfBoundsExeptionIsThrownWhenDeletingNonExistingElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        assertThrows(MyIndexOutOfBoundsException.class, ()->list.delete(5));
    }

    @Test
    public void MyIndexOutOfBoundsExeptionIsThrownWhenTryingToAccessNonExistingElement(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        assertThrows(MyIndexOutOfBoundsException.class, ()->list.get(5));
    }
}