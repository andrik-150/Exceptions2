package homeWork.hw2;

/*Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)*/
/*
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/
public class Task_3 {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        int[] abc = {1, 2};

        if (b == 0) {
            throw new RuntimeException("Делить на ноль нельзя!");
        } else {
            System.out.println(a / b);
        }
        printSum(23, 234);
        int index = 3;
        if(index > abc.length){
            throw new RuntimeException("Массив выходит за пределы своего размера!");
        }
        else {
            abc[index] = 9;
        }
    }
    public static void printSum(Integer a, Integer b) {
        if(a == null | b == null){
            throw new RuntimeException("Указатель не может указывать на null!");
        }
        else {
            System.out.println(a + b);
        }
    }


//        try {
//            System.out.println(a / b);
//            printSum(23, 234);
//            abc[3] = 9;
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (ArithmeticException ex){
//            System.out.println("Делить на ноль нельзя!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }

}