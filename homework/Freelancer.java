package homework;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {
    private double hourlyRate;


    public Freelancer(String surName, String name, double hourlyRate, int age) {
        super(surName, name, 0, age); // При создании сотрудника заработная плата устанавливается в ноль
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }
    @Override
    public String toString() {
        return String.format("Фрилансер %s %s; возраст: %.0f ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, getAge(), salary, calculateSalary());
    }
}
