package by.rudakd.lesson2.task2;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

public class Task2 {
    public static void main(String[] args) {
        int number = 1231;
        int div = 1000;
        int elem[] = new int[4];
        for (int i = 0; i < elem.length; i++){
            elem[i] = number/div % 10;
            div /= 10;
        }
        boolean numAreDifferent = elem[0] != elem[1] && elem[0] != elem[2] && elem[0] != elem[3] && elem[1] != elem[2] &&
                elem[1] != elem[3] && elem[2] != elem[3];
        System.out.println("Цифры различны между собой? Ответ: " + numAreDifferent);
    }
}

