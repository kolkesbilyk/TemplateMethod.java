package templateMethod;

public class Cucumber extends Landing{

    public Cucumber(double area, int countPeople) {
        this.area = area;
        this.countPeople = countPeople;
        this.weightPerArea = 0.1;
    }

    @Override
    public int getLandingTime(double area, int countPeople) {
        int timeForLanding1M = 1;
        int time = (int) (((area * 10000) / countPeople) * timeForLanding1M);
        System.out.println("Для посадки огурцов, с помощью " + countPeople + " человек нужно " + time + " минут");
        return time;
    }

    @Override
    public int getPreparationTime(int countPeople, double weight) {
        int timeFor10kg = 5;
        int time = (int) (Math.ceil((weight / 10) / countPeople) * timeFor10kg);
        System.out.println("Для подготовки к посадке " + weight + " кг огурцов, с помощью " + countPeople + " человек нужно " + time + " минут");
        return time;
    }

//    @Override
//    public double getWeightInKg(double area) {
//        return area * weightPerArea * 1000;
//    }
}
