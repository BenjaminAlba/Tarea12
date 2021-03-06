package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.ArrayList;
import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.List;

public class Main {
    public static void main(String[] args) {

        int cuenta =  LinkedList.getListsCount();

        List<Integer> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista2.add(" hola");
        lista2.add(" Object ");
        lista2.add(" Oriented ");
        lista2.add(" Programming ");

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());
        System.out.println("-------Iterator-------");

        Iterator<Integer> it = lista1.getIterator();

        while(it.hasNext()){
            Integer element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");
        System.out.println("---ReverseIterator---");

        it = lista1.getReverseIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterator<String> itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }

    }
}