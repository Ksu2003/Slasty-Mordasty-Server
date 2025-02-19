package by.fpmibsu.slastymordasty.entity;

public class Cake extends Entity implements Item{

    private NutritionalValue nutritionalValue100g;

    private Image image;
    private String title;
    private String description;
    private double price;
    private int quantity = 0;

    public NutritionalValue getNutritionalValue100g() {
        return nutritionalValue100g;
    }

    public Cake(){

    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public Cake(long id,NutritionalValue nutritionalValue100g, Image image, String title, String description, double price) {
        this.id = id;
        this.nutritionalValue100g = nutritionalValue100g;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public void setNutritionalValue100g(NutritionalValue nutritionalValue100g) {
        this.nutritionalValue100g = nutritionalValue100g;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cake cake = (Cake) o;

        if(Long.compare(cake.id,id)!=0) return false;
        if (Double.compare(cake.price, price) != 0) return false;
        if (!nutritionalValue100g.equals(cake.nutritionalValue100g)) return false;
        if (!image.equals(cake.image)) return false;
        //if (!title.equals(cake.title)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nutritionalValue100g.hashCode();
        result = 31 * result + image.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + description.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "nutritionalValue100g=" + nutritionalValue100g +
                ", image=" + image +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
