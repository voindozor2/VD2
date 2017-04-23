package geekbrains.java_level_one.java_lesson_two;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Борис on 09.02.2017.
 */
public class Second_programm {
    public static void zero_to_one (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
    }

    public static void zapolnenie (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int x=i-1;
            arr[0]=1;
            if(x<0) {
                x=0;
            }
            arr[i]=arr[x]+3;
        }
    }
    public static void umnozh_na_dva (int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<6) {
                arr[i]*=2;
            }
        }
    }


    public static int min_max (int arr[],int commanda){
        int min=429496729;
        int max=0;
        int buf=0;
        for (int i = 0; i < arr.length ; i++) { //находим минимальное число
            buf=arr[i];
            if(buf<min){
                min=buf;
            }
            if(buf>max) {
                max=buf;
            }
        }
        switch (commanda) {
            case 1 : buf=min; break;
            case 2 : buf=max; break;
        }
        return buf;
    }

    public static int calc (int First, int Second , String Operation) {
        int result=0;
        switch (Operation) {
            case "+": result=First+Second; break;
            case "-": result=First-Second; break;
            case "*": result=First*Second; break;
            case "/": result=First/Second; break;
        }

        return result;
    }

    public static void main(String[] args) {


       /* 1.	Создать массив, состоящий из элементов 0 и 1, например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        2.	В массиве из предыдущего пункта с помощью цикла заменить 0 на 1, 1 на 0;
        3.	Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
        4.	Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
        5.	* Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        6.	** Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;
*/
        // Задание №1,2
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        zero_to_one(arr1);
        System.out.println(Arrays.toString(arr1));
        // Задание №3
        int[] arr2 = new int[8];
        zapolnenie(arr2);
        System.out.println(Arrays.toString(arr2));
        // Задание №4
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        umnozh_na_dva(mas);
        System.out.println(Arrays.toString(mas));
        // Задание №5
        int[] arr3 = {1,20,13,74,255,56,17,78,59,100};
        System.out.println("Array=" + Arrays.toString(arr3));
        System.out.println("min=" + min_max(arr3,1));
        System.out.println("max=" + min_max(arr3,2));
        // Задание №6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные операции : +,-,*,/");
        System.out.println("Введите первое число :");
        int First = scanner.nextInt();
        System.out.println("Введите второе число :");
        int Second = scanner.nextInt();
        System.out.println("Введите операцию :");
        String Operation = scanner.next();
        System.out.println("Вычисления равны: " + calc(First , Second , Operation));
    }
}
