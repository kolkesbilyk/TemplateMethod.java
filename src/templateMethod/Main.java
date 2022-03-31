package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Landing landing = null;
        System.out.println("Что сажаем?\n" +
                "1 - Картошку\n" +
                "2 - Огурцы");
        int choice = Integer.parseInt(reader.readLine());
        System.out.println("Какую площадь садим?");
        double area = Double.parseDouble(reader.readLine());
        System.out.println("Сколько человек работает?");
        int countPeople = Integer.parseInt(reader.readLine());
        if (choice == 1) landing = new Potato(area, countPeople);
        else if (choice == 2) landing = new Cucumber(area, countPeople);
        landing.getAllWorkTime();
    }
}
