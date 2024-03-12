package homework;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee{

    private Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    public static Worker create(String surName, String name, double salary, int age){
        return new Worker(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий %s %s; возраст: %.0f; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, getAge(), salary, calculateSalary());
    }
}
