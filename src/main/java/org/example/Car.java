package org.example;

public class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери і сетери
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Реалізація методу compareTo
    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Car)) return 0;

        Car other = (Car) obj;

        // 1. Порівнюємо за ціною (менша ціна — "більше")
        if (this.price != other.price)
            return other.price - this.price;

        // 2. Якщо ціни рівні, порівнюємо за роком випуску (новіший — "більше")
        if (this.year != other.year)
            return this.year - other.year;

        // 3. Якщо рік однаковий — порівнюємо за кінськими силами (більше — "більше")
        return this.horsePower - other.horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}
