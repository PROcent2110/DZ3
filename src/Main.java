import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS >= 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задача 2");
        int prodyktYear = 2015;
        int godProdykta = 2010;
        if (godProdykta < prodyktYear) {
            System.out.print("Установите облегченную версию приложения для ");
        }  else {
            System.out.print("Установите версию приложения для ");
        }
        if (clientOS >=1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("iOS по ссылке");
        }
        System.out.println("Задача 3");
        int year = 2019;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println("Задача 5");
        int monthNumber = 8;
        switch (monthNumber) {
            case  1:
            case  2:
            case  12:
                System.out.println("Зима");
                break;
            case  3:
            case  4:
            case  5:
                System.out.println("Весна");
                break;
            case  6:
            case  7:
            case  8:
                System.out.println("Лето");
                break;
            case  9:
            case  10:
            case  11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }

}

