package ru.mirea.aav.lab6;
import java.util.ArrayList;
public class QuickSort {
    public void quickSort(ArrayList<Student> arr, int from, int to) {
        if (from < to) {
            int SIndex = Q(arr, from, to);
            quickSort(arr, from, SIndex - 1);
            quickSort(arr, SIndex, to);
        }
    }
    private static int Q(ArrayList<Student> arr, int from, int to) {
        StComparator T = new StComparator();
        int indexLeft = from;
        int indexRight = to;
        Student N = arr.get(from + (to - from) / 2);
        while (indexLeft <= indexRight) {
            while (T.compare(arr.get(indexLeft), N) < 0) {
                indexLeft++;
            }
            while (T.compare(arr.get(indexRight), N) > 0) {
                indexRight--;
            }
            if (indexLeft <= indexRight) {
                swap(arr, indexLeft, indexRight);
                indexLeft++;
                indexRight--;
            }
        }
        return indexLeft;
    }
    private static void swap(ArrayList<Student> arr, int indexLeft, int indexRight)
    {
        String NName;
        int NOrders;
        NName = arr.get(indexLeft).getName();
        NOrders = arr.get(indexLeft).getSUM();
        arr.get(indexLeft).setName(arr.get(indexRight).getName());
        arr.get(indexLeft).setSUM(arr.get(indexRight).getSUM());
        arr.get(indexRight).setName(NName);
        arr.get(indexRight).setSUM(NOrders);
    }
}
