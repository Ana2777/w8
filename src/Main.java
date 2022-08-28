import java.util.Random;
public class Main {
    public static int randonYear() {
        Random year = new Random();
        int a = year.nextInt(3000) + 1;
        System.out.print(a);
       return a;
    }
    public static void whatYear() {
        int year = randonYear();
        if (year % 100 >= 0 || year % 400 == 0 || year % 4 == 0) {
            System.out.print(" - год является високостным");
    } else {
        System.out.print(" - год не является високостным");
    }
    }
    public static void clientIos (int currentYear, int clientOs) {
        if (clientOs == 0 && currentYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && currentYear < 2015)
            System.out.println("Установите облегченную версию для iOS по ссылке");
        if (clientOs == 1 && currentYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию для Android");
        }
    }
    public static void delivery (int distance) {
        int deliveryTime = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            if (distance <= 60 && distance >= 20) {
                System.out.println("Потребуется дней " + (deliveryTime + 1));
            } else {
                if (distance >= 60 && distance <= 100)
                    System.out.println("Потребуется дней " + (deliveryTime + 2));
            }
        }

    }
        public static void main (String[] args) {
//Задание 1
      whatYear();

// Задание 2
            int currentYear = 2022;
            int сlientOs = 1;
            clientIos();

// Задание 3
            int distance = 50;
            delivery();
    }
}
