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

        //task4,5
        System.out.println("task4,5");

        int vasiliMoney = 15000;
        int vasiliMonth = 0;
        while (vasiliMoney < 12000000) {
            vasiliMonth = vasiliMonth+1;
            vasiliMoney = vasiliMoney + vasiliMoney/100*7;
            if ((vasiliMonth % 6) == 0) {
                System.out.println(vasiliMonth+" месяц, сумма: "+vasiliMoney);
            }
        }

        //task6
        System.out.println("task6");

        int vasiliMoney2 = 15000;
        int vasiliMonth2 = 0;
        while (vasiliMonth2 < 108) {
            vasiliMonth2 = vasiliMonth2 + 1;
            vasiliMoney2 = vasiliMoney2 + vasiliMoney2/100*7;
            if ((vasiliMonth2 % 6) == 0) {
                System.out.println(vasiliMonth2+" месяц, сумма накоплений: "+ vasiliMoney2);
            }
        }

        //task7
        System.out.println("task7");

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, "+ friday);
            friday = friday + 7;
        }

        //task8
        System.out.println("task8");

        for (int j = 0; j <= 2124; j++) {
            if ((j % 79) == 0) {
                if (j > 1823 && j < 2124) {
                    System.out.println(j);
                }
            }
        }
    }
}