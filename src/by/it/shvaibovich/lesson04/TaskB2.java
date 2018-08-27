package by.it.shvaibovich.lesson04;

import java.util.Scanner;

/*
Таблица умножения
Вывести на экран таблицу умножения size х size используя цикл while.
size прочитать c клавиатуры. Числа разделить пробелом.

Пример вывода на экран для числа 10:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100


Требования:
1. Программа должна считывать переменную int size c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить таблицу умножения size х size.
 */
public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i1=1; int i2=1;
while (i2<=size){
    System.out.print(i1*i2+" ");
    i1=i1+1;
if (i1>size){
    System.out.println();
    i1=1; i2=i2+1;
}
}
    }
}
