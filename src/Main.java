
public class Main {
    public static void whatYear(int year) {
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
        return;
    }
    public static String determinationOfDeliveryDays (int distance) {
        int deliveryTime = 1;
        System.out.println(distance <= 20 ? "Потребуется дней" + deliveryTime : distance <= 60 && deliveryTime >=20 ? "Потребуется дней" + (deliveryTime+1) : deliveryTime <= 100 && deliveryTime >= 60 ? "Потребуется дней" + (deliveryTime + 2));
    }
    public static void main (String[] args) {
    //Задание 1
    int year = 2019;
    whatYear();
        // Задание 2
        int currentYear = 2022;
        int сlientOs = 1;
        clientIos();

// Задание 3
        int distance = 50;
        determinationOfDeliveryDays();




    }
}
