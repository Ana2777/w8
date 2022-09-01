public class Main {
    public static void whatYear (int year) {
        if (year % 100 == 0 || year % 400 == 0 || year % 100 > 0 && year % 4 == 0 ) {
            System.out.print("год является високостным");
        } else {
            System.out.print("год не является високостным");
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
    public static void determinationOfDeliveryDays (int distance) {
       int beginning = 20;
       int step = 40;
       int numberOfDays = 1;
       if (distance >= beginning);
       numberOfDays = (Math.abs((distance-beginning)/step)+2);
       System.out.println("Для доставки подредуется " + numberOfDays + " дней");
    }


        public static void main (String[] args) {
        //Задание 1
whatYear(2020);
// Задание 2
        //int currentYear = 2022;
       // int сlientOs = 1;
        clientIos(2022, 1);
        // Задание 3
        //int distance = 50;
        determinationOfDeliveryDays(50);


    }
}