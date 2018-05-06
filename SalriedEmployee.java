public class SalriedEmployee extends Employee {

    private double weekelySalery;

    public SalriedEmployee(String name, String id, double weekelySalery) {
        super(name, id);
        this.weekelySalery = weekelySalery;
    }

    public double getWeekelySalery() {
        return weekelySalery;
    }

    public void setWeekelySalery(double weekelySalery) {
        this.weekelySalery = weekelySalery;
    }

    @Override
    public String toString() {
        return super.toString()+weekelySalery;
    }
}

