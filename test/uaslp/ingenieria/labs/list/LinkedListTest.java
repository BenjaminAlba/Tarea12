package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void IncrementListCount(){
        LinkedList<Integer> lista = new LinkedList<>();

        int listsCount=LinkedList.getListsCount();

        assertEquals(1,listsCount);
    }

    @Test
    public void IteratorIsEqualToListElementWhenCallingNext(){
        Integer element=0;
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        Iterator<Integer> it = lista.getIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals(6,element);
    }

    @Test
    public void ReverseIteratorIsEqualToListElementWhenCallingNext(){
        Integer element=0;
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(6);

        Iterator<Integer> it = lista.getReverseIterator();

        while(it.hasNext()){
            element = it.next();
        }

        assertEquals(6,element);
    }


    @Test
    public void ValidateListIsEmpty(){

        LinkedList<Integer> lista = new LinkedList<>();

        int size = lista.getSize();

        assertEquals(0,size);
    }

    @Test
    public void AddingElementToListGrowsItsSize(){
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(5);

        assertEquals(1,lista.getSize());
        assertEquals(5,lista.get(0));
    }

    @Test
    public void DecreasingListSize(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(0);

        assertEquals(2,lista.getSize());
        assertEquals(10,lista.get(0));
        assertEquals(50,lista.get(1));
    }

    @Test
    public void DeletingMiddleElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(1);

        assertEquals(2,lista.getSize());
        assertEquals(5,lista.get(0));
        assertEquals(50,lista.get(1));
    }

    @Test
    public void DeletingLastElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(2);

        assertEquals(2,lista.getSize());
        assertEquals(5,lista.get(0));
        assertEquals(10,lista.get(1));
    }

    @Test
    public void DeleteAllElements(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(2);
        lista.delete(1);
        lista.delete(0);

        assertEquals(0,lista.getSize());
    }

    @Test
    public void SizeRemainsWhenDeletingNonExistentElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delete(3);

        assertEquals(3,lista.getSize());
    }
}