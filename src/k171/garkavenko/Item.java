package k171.garkavenko;

public class Item {

    public String name;
    public float price;

    public Item(String name, float price){

        boolean priceLowerThan0 = price < 0;

        if (priceLowerThan0){
            this.name = name;
            this.price = 0;
            return;
        }

        this.name = name;
        this.price = price;
    }

    public void increasePrice(float percent){
        float PERCENT_COEFFICIENT = 0.01f;

        float increasedPrice = this.price + this.price * (PERCENT_COEFFICIENT * percent);

        this.price = increasedPrice;
    }

    public void decreasePrice(float percent){
        float PERCENT_COEFFICIENT = 0.01f;

        float decreasedPrice = this.price - this.price * (PERCENT_COEFFICIENT * percent);

        boolean priceLowerThan0 = decreasedPrice < 0;

        if (priceLowerThan0) {
            this.price = 0;
            return;
        }


        this.price = decreasedPrice;
    }
}
