package by.fpmibsu.slastymordasty.entity;


import java.util.ArrayList;
import java.util.List;

public class Constructor extends Entity implements Item{



    Image image;
    double price;

    List<Component> recipe;

    public List<Component> getRecipe() {
        return recipe;
    }

    public void setRecipe(List<Component> recipe) {
        this.recipe = recipe;
    }




    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String s = id + " price: " + price + "{" + '\n';

        for(Component i: recipe){
            s += recipe.toString() + '\n';
        }

        s += "}";
        return s;
    }
}
