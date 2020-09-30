package k171.garkavenko;

/**
 * Лабораторная работа №2
 *
 * @author Денис ГАркавенко K17.1
 * @version 1.0
 */
public class Main {

    /**
     * точка входа в программу
     * @param args нечего не принимает
     */
    public static void main(String[] args) {
        //обьявление обьекта корзины
        Cart cart = new Cart(6);
        //обьявление обьектов товаров
        Item fish = new Item("fish solonaya", 25.2f);
        Item meat = new Item("chicken", 143);
        Item crisps = new Item("lux", 50.4f);
        Item juice = new Item("sadochok", 30);
        Item chocolate = new Item("milka", 21.5f);
        //доабавление товаров в массив товаров
        Item[] items = {fish, meat, crisps, juice, chocolate};
        //добавление переменных из массива товаров в обьект корзины
        for (Item item :
                items) {
            cart.addItem(item);
        }
        //считает ценутоваров
        cart.recalculateCartPrice();
        //выводит цену
        cart.showPrice();
        //увеличивает цену на 15%
        cart.increaseSum(15);
        cart.recalculateCartPrice();
        cart.showPrice();
        //уменьшает цену на 15%
        cart.decreaseSum(30);
        cart.recalculateCartPrice();
        cart.showPrice();
    }
}
