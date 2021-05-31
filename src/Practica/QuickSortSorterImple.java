package Practica;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort( arr, 0, arr.length - 1, c);
    }

    // Implementacion generica recursiva de QuickSort
    public void quickSort(T[] arr, int low, int high, Comparator<T> c)
    {
        //Si el array esta vacio o es de longitud 0, retorno
        if (arr == null || arr.length == 0){
            return;
        }

        // Si se cruzo o si el punto izquierdo es igual al derecho, retorno
        if (low >= high){
            return;
        }

        //Guardo el elemento pivote del medio de la lista
        int middle = low + (high - low) / 2;
        T pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while ( c.compare(arr[i], pivot) < 0 ) // arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (c.compare(arr[j], pivot) > 0 ) //arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j){
            quickSort(arr, low, j, c);
        }
        if (high > i){
            quickSort(arr, i, high, c);
        }
    }

    public void swap(T array[], int x, int y)
    {
        T temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
