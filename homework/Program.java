package homework;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(5);
        for (Employee worker : workers) {
            System.out.println(worker);
        }

//        System.out.println();
//        System.out.println("Cортировка по алфавиту имён");
//        System.out.println();
//
//        Arrays.sort(workers);
//
//        for (Employee worker : workers) {
//            System.out.println(worker);
//        }
//        System.out.println();
//        System.out.println("Cортировка по заработной плате");
//        System.out.println();
//
//        Arrays.sort(workers, new SalaryComparator());
//
//        for (Employee worker : workers) {
//            System.out.println(worker);
//        }

        System.out.println();
        System.out.println("Cортировка по возрасту");
        System.out.println();

        Arrays.sort(workers, new AgeComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }
    }

}
