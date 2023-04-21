package homeWork.hw2;

import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }
    public static float getFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String str = sc.next();
        float fl;
        try {
            fl = Float.parseFloat(str);
        }
        catch (NumberFormatException e){
            return getFloat();
        }
        sc.close();
        return fl;
    }
}