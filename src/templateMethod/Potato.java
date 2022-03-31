package templateMethod;

public class Potato extends Landing{

    public Potato(double area, int countPeople) {
        this.area = area;
        this.countPeople = countPeople;
        this.weightPerArea = 4;
    }

    @Override
    public int getLandingTime(double area, int countPeople) {
        int timeForLanding1M = 5;
        int time = (int) (((area * 10000) / countPeople) * timeForLanding1M);
        System.out.println("Для посадки картошки, с помощью " + countPeople + " человек нужно " + time + " минут");
        return time;
    }

    @Override
    public int getPreparationTime(int countPeople, double weight) {
        int timeFor20kg = 10;
        int time = (int) (Math.ceil((weight / 20) / countPeople) * timeFor20kg);
        System.out.println("Для подготовки к посадке " + weight + " кг картошки, с помощью " + countPeople + " человек нужно " + time + " минут");
        return time;
    }

//    @Override
//    public double getWeightInKg(double area) {
//        return area * weightPerArea * 1000;
//    }
}
