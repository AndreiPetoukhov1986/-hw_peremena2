public class Main {
    public static void main(String[] args) {
        task1();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
    }
      public static void task1 () {
            System.out.println("Задача №1");
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOs по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
    public static void task2 () {
        System.out.println("Задача №2");
        int clientMobile = 0, clientDeviceYear = 2013;
        switch (clientMobile) {
            case 0:
                if (clientDeviceYear <= 2015) {
                    System.out.println("Установите упрощенную версию приложения для iOs по ссылке");
                } else  {
                    System.out.println("Установите версию приложения для iOs по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear <= 2015) {
                    System.out.println("Установите упрощенную версию приложения для Android по ссылке");
                } else  {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default: {
                System.out.println("нет такого телефона");
            }

        }
    }

    public static void task3 (){
        System.out.println("Задача №3");
        int year = 2023;
        if ( year % 4 == 0  && year % 100 != 0 ||  year % 400 == 0) {
            System.out.println(  year + " год высокосный");
        }
        else {
            System.out.println( year + " год не высокосный");
        }
        }

    public static void task4 () {
        System.out.println("Задача №4");
        int deliveryDistance = 60, day = 1;
        if (deliveryDistance >20) {
            day++;        }
        if (deliveryDistance>60) {
            day++;
        }
            System.out.println("Потребуется дней: " + day);
        if (deliveryDistance>100) {
            System.out.println("Доставки нет");
        }

        }

    public static void task5 (){
        System.out.println("Задача №5");
        int monthNumber = 2;
switch (monthNumber){
    case 1:
    case 2:
    case 12:
        System.out.println("Зима");
    break;
    case 3:
    case 4:
    case 5:
        System.out.println("весна");
    break;
    case 6:
    case 7:
    case 8:
        System.out.println("лето");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("осень");
        break;
    default:
        System.out.println("всего 12 месяцев");

}
    }


        }


