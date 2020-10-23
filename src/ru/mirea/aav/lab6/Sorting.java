package ru.mirea.aav.lab6;
import java.util.ArrayList;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>(20);
        for (int i = 0; i < 10; i++){
            arrayList.add(new Student("Student" + i, (int)(Math.random() * 10 + 10)));
        }
        System.out.println("List: ");
        for (int i = 0; i < 10; i++){
            System.out.println(arrayList.get(i).getName() + " " + arrayList.get(i).getSUM());
        }
        QuickSort qs = new QuickSort(); //алгоритм быстрой сортировки
        qs.quickSort(arrayList, 0, arrayList.size() - 1);
        System.out.println("SortList: ");
        for (int i = 0; i < 10; i++){
            System.out.println(arrayList.get(i).getName() + " " + arrayList.get(i).getSUM());
        }
    }
}
