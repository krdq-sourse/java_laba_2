package k171.garkavenko;

/**
 * Класс Товара
 */
public class Item {

    // название товара
    public String name;
    // цена товара
    public float price;

    /**
     * Конструктор класса
     * @param name название товара
     * @param price цена товара
     */
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

    /**
     * увелеичение цены
     * @param percent процент
     */
    public void increasePrice(float percent){
        float PERCENT_COEFFICIENT = 0.01f;

        float increasedPrice = this.price + this.price * (PERCENT_COEFFICIENT * percent);

        this.price = increasedPrice;
    }

    /**
     * уменьшение цены
     * @param percent процент
     */
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
