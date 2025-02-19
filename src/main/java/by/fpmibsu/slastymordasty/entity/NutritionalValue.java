package by.fpmibsu.slastymordasty.entity;

public class NutritionalValue extends Entity {
    private double proteins;
    private double fats;
    private double carbohydrates;
    private double caloriesKJoules;
    private double caloriesKcal;

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getCaloriesKJoules() {
        return caloriesKJoules;
    }

    public void setCaloriesKJoules(double caloriesKJoules) {
        this.caloriesKJoules = caloriesKJoules;
    }

    public double getCaloriesKcal() {
        return caloriesKcal;
    }

    public void setCaloriesKcal(double caloriesKcal) {
        this.caloriesKcal = caloriesKcal;
    }

    public NutritionalValue(long id,double proteins, double fats, double carbohydrates, double caloriesKJoules, double caloriesKcal) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.caloriesKJoules = caloriesKJoules;
        this.caloriesKcal = caloriesKcal;
        this.id = id;
    }

    public NutritionalValue(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NutritionalValue that = (NutritionalValue) o;

        if(id != that.id) return false;
        if (Double.compare(that.proteins, proteins) != 0) return false;
        if (Double.compare(that.fats, fats) != 0) return false;
        if (Double.compare(that.carbohydrates, carbohydrates) != 0) return false;
        if (Double.compare(that.caloriesKJoules, caloriesKJoules) != 0) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(proteins);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fats);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(carbohydrates);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(caloriesKJoules);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(caloriesKcal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "NutritionalValue{" +
                ", id=" + id +
                "proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", caloriesKJoules=" + caloriesKJoules +
                ", caloriesKcal=" + caloriesKcal +
                '}';
    }
}
