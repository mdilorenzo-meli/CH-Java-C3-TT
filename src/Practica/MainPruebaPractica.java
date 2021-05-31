package Practica;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class MainPruebaPractica {

    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Sorter s = (Sorter) MiFactory.getInstance("sorter");

        String[] cadenas = {"prueba", "ola", "Albatross"};

        System.out.println("Ordenamiento de cadenas - Antes");
        for (String a:cadenas)
            System.out.println(a);

        Comparator<String> stringComparator = (String o1, String o2)->o1.compareTo(o2);

        s.sort(cadenas, stringComparator);

        System.out.println("Ordenamiento de cadenas - Despues");
        for (String a:cadenas)
            System.out.println(a);

        Integer[] arrEnteros = {7,6,5,3,4,2,1};

        System.out.println("Ordenamiento de enteros - Antes");
        for (Integer a:arrEnteros)
            System.out.println(a);

        Comparator<Integer> integerComparator = (Integer o1, Integer o2)->o1-o2;

        s.sort(arrEnteros, integerComparator);

        System.out.println("Ordenamiento de enteros - Despues");
        for (Integer a:arrEnteros)
            System.out.println(a);
        
    }
}
