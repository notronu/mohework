// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte k = 28;
        short b = 175;
        int c = 7426;
        long g = 3000L;
        float h = 12.8f;
        double t = 492.481;
        System.out.println("Значение переменной с типом byte равно " +  k);
        System.out.println("Значение переменной с типом short равно " +  b);
        System.out.println("Значение переменной с типом int равно " +  c);
        System.out.println("Значение переменной с типом long равно " +  g);
        System.out.println("Значение переменной с типом float равно " +  h);
        System.out.println("Значение переменной с типом double равно " +  t);

        System.out.println("Задача 2");
        byte q = 67;
        short w = -159;
        short e = 569;
        int i = 27897;
        long r = 987678965549L;
        float y = 27.12f;
        double u = 2.786;

        System.out.println("Задача 3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short paper = 480;
        int allStudents = ludmila + anna + ekaterina;
        int eachStudent = paper / allStudents;
        System.out.println(" На каждого ученика рассчитано " + eachStudent + " листов бумаги ");

        System.out.println("Задача 4");
        byte bottles = 16;
        byte z = 20;
        short x = 1440;
        short v = 4320;
        int n = 43200;
        int bottlesPerMinute = bottles / 2;
        int bottlesK = bottlesPerMinute * z;
        int bottlesL = bottlesPerMinute * x;
        int bottlesP = bottlesPerMinute * v;
        int bottlesJ = bottlesPerMinute * n;
        System.out.println(" За " + z + " минут " + " машина произвела " + bottlesK + " штук бутылок»");
        System.out.println(" За " + x + " минут " + " машина произвела " + bottlesL + " штук бутылок»");
        System.out.println(" За " + v + " минут " + " машина произвела " + bottlesP + " штук бутылок»");
        System.out.println(" За " + n + " минут " + " машина произвела " + bottlesJ + " штук бутылок»");

        System.out.println("Задача 5");
        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int eachClasses = whitePaint + brownPaint;
        int howManyClasses = paint / eachClasses;
        int howManyWhite = howManyClasses * 2;
        int howManyBrown = howManyClasses * 4;
        System.out.println("В школе, где " +howManyClasses + " классов, нужно " +howManyWhite + " банок белой краски и " +howManyBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        byte bananas = 5;
        byte oneBananas = 80;
        short milk = 2;
        byte oneMilk = 105;
        byte iceCream = 2;
        byte oneIceCream = 100;
        byte eggs = 4;
        byte oneEggs = 70;
        int allBananas = bananas * oneBananas;
        int allMilk = milk * oneMilk;
        int allIceCream = iceCream * oneIceCream;
        int allEggs = eggs * oneEggs;
        int allFood = allBananas + allMilk + allIceCream + allEggs;
        float allFoodKg = allFood / 1000f;
        System.out.println(" Вес такого спортзавтрака в граммах " +allFood + " а в килограммах " + allFoodKg );

        System.out.println("Задача 7");
        byte overWeight = 7;
        int overWeightInGr = overWeight * 1000;
        short loseWeight = 250;
        short loseWeightMore = 500;
        int howManyDays = overWeightInGr / loseWeight;
        int howManyDaysMore = overWeightInGr / loseWeightMore;
        System.out.println(" Дней потребуется для похудения " + howManyDays + ", либо " + howManyDaysMore + " дней" );

        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int salaryM = masha / 100 * 10;
        int salaryD = denis / 100 * 10;
        int salaryK = kristina / 100 * 10;
        int nowM = masha + salaryM;
        int nowD = denis + salaryD;
        int nowK = kristina +salaryK;
        System.out.println("Маша теперь получает " + nowM + " рублей. Годовой доход вырос на " + salaryM + " рублей");
        System.out.println("Маша теперь получает " + nowD + " рублей. Годовой доход вырос на " + salaryD + " рублей");
        System.out.println("Маша теперь получает " + nowK + " рублей. Годовой доход вырос на " + salaryK + " рублей");
















    }
}