package homeWork.hw2;
/*Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)*/

/*
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/
public class Task_2 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int d = 0;

        if(d == 0){
            System.out.println("Делить на ноль нельзя!");
        }
        if(8 > intArray.length){
            System.out.println("Массив меньше, чем индекс объекта!");
        }
        else{
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }

//        try {
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Out of bound exception: " + e);
//        }catch (NullPointerException e){
//            System.out.println("Null pointer exception: " + e);
//        }
    }
}