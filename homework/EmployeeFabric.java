package homework;

import java.util.Random;

public class EmployeeFabric {
    public static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        if (random.nextBoolean()) {
            return generateWorker();
        } else {
            // Генерация Freelancer с случайной почасовой ставкой от 20 до 100
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], random.nextInt(20, 101), random.nextInt(18, 72));
        }
    }

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 72);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }

    /**
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }



}
