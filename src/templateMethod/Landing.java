package templateMethod;

public abstract class Landing {
    double weightPerArea;
    double area;
    int countPeople;

    public Landing() {
    }

    public void getAllWorkTime(){
        double weight = getWeightInKg(this.area);
        int time = getPreparationTime(this.countPeople, weight) + getLandingTime(this.area, this.countPeople);
        if (time < 60 && time > 0) System.out.println("Всего на роботу ушло " + time + " минут");
        else if (time >= 60) System.out.println("Всего на роботу ушло " + time/60 + " час(ов) " + time % 60 + " минут");
    }

    public abstract int getLandingTime(double area, int countPeople);
    public abstract int getPreparationTime(int countPeople, double weight);

    public double getWeightInKg(double area){
        return area * this.weightPerArea * 1000;
    }
}
