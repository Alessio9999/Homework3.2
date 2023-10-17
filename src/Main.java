import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    private static void Task1() {
        System.out.println("\nЗадача 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите Вашу OS (0 или 1), где 0 - iOS, 1 - Android: ");
        byte clientOS = -1;
        if (scanner.hasNextByte()) clientOS = scanner.nextByte();
        else System.out.println("Вы ввели некорректное число");

        String answerStr;
        if (clientOS == 0) answerStr = "Установите версию приложения для iOS по ссылке";
        else
            if (clientOS == 1) answerStr = "Установите версию приложения для Android по ссылке";
            else answerStr = "Такая ОС не поддерживается...";
        System.out.println(answerStr);
    }

    private static void Task2() {
        System.out.println("\nЗадача 2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите Вашу OS (0 или 1), где 0 - iOS, 1 - Android: ");
        byte clientOS = -1;
        if (scanner.hasNextByte()) clientOS = scanner.nextByte();
        else System.out.println("Вы ввели некорректное число!");

        System.out.println("Укажите год производства Вашего телефона: ");
        short deviceYear=2010;
        if (scanner.hasNextShort()) deviceYear = scanner.nextShort();
        else System.out.println("Вы ввели некорректное число, поэтому устройство будет считаться "
                + deviceYear + " года производства");

        String answerStr;
        if (clientOS == 0)
            if (deviceYear >= 2015) answerStr = "Установите версию приложения для iOS по ссылке";
            else answerStr = "Установите облегченную версию приложения для iOS по ссылке";
        else
            if (clientOS == 1)
                if(deviceYear >= 2015) answerStr = "Установите версию приложения для Android по ссылке";
                else answerStr = "Установите облегченную версию приложения для Android по ссылке";
            else answerStr = "Такая ОС не поддерживается...";
        System.out.println(answerStr);
    }

    private static void Task3() {
        System.out.println("\nЗадача 3:");
        short firstLeapYear = 1584;
        short year = 2021;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        if (scanner.hasNextShort()) year = scanner.nextShort();
        else System.out.println("Вы ввели некорректное число, поэтому по умолчанию год выбран " + year);

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year >= firstLeapYear;
        if (isLeapYear)System.out.println(year + " год является високосным");
        else System.out.println(year + " год НЕ является високосным");
    }
    private static void Task4() {
        System.out.println("\nЗадача 4:");
        byte days = 0;
        short deliveryDistance = 95;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние от офиса до адреса доставки: ");
        if (scanner.hasNextShort()) deliveryDistance = scanner.nextShort();
        else System.out.println("Вы ввели некорректное число, поэтому по умолчанию расстояние доставки равно "
                + deliveryDistance + " км");

        String answerStr = "";
        if (deliveryDistance <= 20) days = 1;
        else
            if (deliveryDistance <= 60) days = 2;
            else
                if (deliveryDistance <= 100) days = 3;
                else days = 0;

        if (days>0) answerStr = "Потребуется дней на доставку: " + days;
        else answerStr = "На такое расстояние доставки нет...";
        System.out.println(answerStr);
    }
    private static void Task5() {
        System.out.println("\nЗадача 5:");
        byte monthNumber = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        if (scanner.hasNextByte()) monthNumber = scanner.nextByte();
        else System.out.println("Вы ввели некорректное число, поэтому по умолчанию номер месяца равен: "
                + monthNumber);

        String answerStr ="";
        switch (monthNumber)
        {
            case 12:
            case 1:
            case 2:
                answerStr ="Зима";
                break;
            case 3:
            case 4:
            case 5:
                answerStr ="Весна";
                break;
            case 6:
            case 7:
            case 8:
                answerStr ="Лето";
                break;
            case 9:
            case 10:
            case 11:
                answerStr ="Осень";
                break;
            default:
                answerStr ="Такого месяца не существует...";
        }
        System.out.println(answerStr);
    }

}