public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0: {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            break;
            case 1: {
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }


        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }
    public static void task3(){

        System.out.println("Задача 3");
        int year = 2021;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " . год является високосным");
        }
        else {
            System.out.println(year + " . год не является високосным.");
        }
        System.out.println();
    }
    //В банке для клиентов организовывается доставка карт на дом.
    // Чтобы известить клиента о том, когда будет доставлена его карта,
    // нужно знать расстояние от офиса до адреса доставки.
    //
    //Правила доставки такие:
    //
    //Доставка в пределах 20 км занимает сутки.
    //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    //Свыше 100 км доставки нет.
    //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
    //
    //Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
    //
    //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance > 100){
            System.out.println(" Доставки нет ");
        }
        else {
            int day = 1;
            if (deliveryDistance > 20){
                day ++;
            }
            if (deliveryDistance > 60){
                day++;
            }
            System.out.println("Потребуется дней" + day);
        }

        }
}