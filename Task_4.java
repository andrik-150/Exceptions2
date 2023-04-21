package homeWork.hw2;

import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

public class Task_4 {
    public static void main(String[] args) {
        userAnswer();

    }
    public static void userAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String str = sc.nextLine();
        if(str.isEmpty()){
            System.out.println("Пустые строки вводить нельзя!");
            throw new RuntimeException("Строка = null");
        }
        if(str.isBlank()){
            System.out.println("Пустые строки вводить нельзя!");
            throw new RuntimeException("В строке только пробелы");
        }
        else {
            System.out.println("Добрый день, " + str + "!");
        }
    }
}