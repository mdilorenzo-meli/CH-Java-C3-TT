package Practica;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        T auxiliar;

        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if( c.compare( arr[j], arr[j+1] ) > 0 ){
                    auxiliar = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = auxiliar;
                }
            }
        }
    }
}