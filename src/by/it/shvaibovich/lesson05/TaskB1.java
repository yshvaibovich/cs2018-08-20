package by.it.shvaibovich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
list.add("one"); list.add("two");list.add("three");list.add("four");list.add("five");
        System.out.println(list.size());
        for (java.lang.String element:list) {
            System.out.println(element);
        }
    }
}
