package org.example;

public class Main {
    public static void main(String[] args) {
        // === Завдання 1 ===
        Dog dog = new Dog("Бім");
        Cat cat = new Cat("Мурчик");
        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());

        // === Завдання 2 ===
        Point point = new Point(2.0, 3.5);
        System.out.println("Початкова точка: " + point);
        point.moveTo(5.5, 8.0);
        System.out.println("Після переміщення: " + point);
        point.setX(10);
        point.setY(15);
        System.out.println("Після змін координат: " + point);

        // === Завдання 3 ===
        Smartphone phone = new Smartphone("Samsung Galaxy", 49.8397, 24.0297);
        System.out.println("\nІнформація про смартфон:");
        System.out.println(phone);

        phone.makeCall();
        phone.receiveCall();

        double[] coords = phone.getCoordinates();
        System.out.println("Координати: широта = " + coords[0] + ", довгота = " + coords[1]);

        // === Завдання 4 ===
        System.out.println("\n=== Завдання 4 ===");

        Car car1 = new Car(20000, 2018, 150);
        Car car2 = new Car(18000, 2020, 140);
        Car car3 = new Car(20000, 2018, 180);

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car3: " + car3);

        System.out.println("\nПорівняння car1 і car2: " + car1.compareTo(car2));
        System.out.println("Порівняння car1 і car3: " + car1.compareTo(car3));
        System.out.println("Порівняння car2 і car3: " + car2.compareTo(car3));
    }
}

