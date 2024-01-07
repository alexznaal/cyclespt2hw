public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");

        int salary = 15000;
        int month = 0;
        int total = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
        }
        System.out.println("Месяц "+month+", сумма накоплений "+total);

        //task2
        System.out.println("task2");

        int a = 1;
        int b = 10;
        while (a <= 10) {
            System.out.print(a+" ");
            a++;
        }
        System.out.println("");
        for (int i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }


        //task3
        System.out.println("task3");

        int countryPopulation = 12_000_000;
        int addCount = (countryPopulation/1000)*(17-8);
        int i;
        for (i = 0; i < 10; i++) {
            countryPopulation = countryPopulation+addCount;
        }
        System.out.println("Год "+i+" численность населения составляет "+countryPopulation);
    }
}