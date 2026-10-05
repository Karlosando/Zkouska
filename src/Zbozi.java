public class Zbozi {
    private int code;
    private String name;
    private double cost;
    private double mnozstvi;

    public Zbozi(int code, String name, double cost){
        this.code=code;
        this.name=name;
        this.cost=cost;
    }


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double mnozstvi(double mnozstvi) {
        if (mnozstvi >= 11) {
            return (cost * mnozstvi) * 0.80;
        } else if (mnozstvi >= 5) {
            return (cost * mnozstvi) * 0.90;
        } else {
            return cost * mnozstvi;
        }
    }


}
