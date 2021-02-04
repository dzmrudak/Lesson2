package by.rudakd.lesson2.task1;

//Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.

public class Task1 {
    public static void main(String[] args) {
        int convertNumber = 1234;
        int div = 1000, fact = 1;
        int number[] = new int[4];
        int authNum = 0;
        for (int i = 0; i < number.length; i++){
            number[i] = convertNumber/div % 10 * fact;
            div /= 10;
            fact *= 10;
            authNum += number[i];
        }
        System.out.println("Authentic number =  " + authNum);
    }
}
