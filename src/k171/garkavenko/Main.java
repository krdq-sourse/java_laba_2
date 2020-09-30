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
        //обьявление переменных
        Cart cart = new Cart(6);
        Item fish = new Item("fish solonaya", 25.2f);
        Item meat = new Item("chicken", 143);
        Item crisps = new Item("lux", 50.4f);
        Item juice = new Item("sadochok", 30);
        Item chocolate = new Item("milka", 21.5f);
        //доабавление переменных в масив
        Item[] items = {fish, meat, crisps, juice, chocolate};
        for (Item item :
                items) {
            cart.addItem(item);
        }
        cart.recalculateCartPrice();
        cart.showPrice();
        cart.increaseSum(15);
        cart.recalculateCartPrice();
        cart.showPrice();
        cart.decreaseSum(30);
        cart.recalculateCartPrice();
        cart.showPrice();
        Science science = new Science();
        int[] testNumberSet1 = new int[]{1, 2, -3, 4, 5, 6, 7, 8, 9, -10, 11};

        int firstTaskResult = science.findSumOfOddIndexElements(testNumberSet1);
        int secondTaskResult = science.findSumOfElementsBetweenNegaive(testNumberSet1);

        System.out.println(firstTaskResult);
        System.out.println(secondTaskResult);
    }
}
