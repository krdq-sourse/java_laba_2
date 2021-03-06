package k171.garkavenko;

import java.util.Stack;

/**
 * Класс коризины
 *
 * @author Гаркавенко Денис
 * @version 1.0
 */
public class Cart {
    private Stack<Item> container = new Stack<Item>();
    private float generalCartPrice = 0;
    private int size;

    /**
     * Конструктор класса Cart
     *
     * @param size размер
     */
    public Cart(int size) {
        this.size = size;
    }

    /**
     * Метод добавляет продукт в корзина
     *
     * @param toAdd обьект типа Item
     */
    public void addItem(Item toAdd) {
        boolean cartNotFull = this.container.size() != this.size;

        if (cartNotFull) this.container.push(toAdd);

    }

    /**
     * Удалаят последний елемент в корзине
     */
    public void deleteItem() {
        boolean cartNotEmpty = this.container.size() != 0;

        if (cartNotEmpty) this.container.pop();
    }

    /**
     * Пресцитываец цены
     */
    public void recalculateCartPrice() {
        this.generalCartPrice = 0;

        Stack<Item> copyStack = (Stack<Item>) this.container.clone();

        int itemsInCart = this.container.size();

        for (int i = 0; i < itemsInCart; i++) {

            Item current = copyStack.pop();
            this.generalCartPrice += current.price;
        }
    }


    /**
     * увеличивает сумму на опрееденные процент
     *
     * @param percent процент, на который увелисчиваеться сумма
     */
    public void increaseSum(float percent) {
        Stack<Item> copyStack = (Stack<Item>) container.clone();
        Stack<Item> middleStack = new Stack<Item>();
        Stack<Item> finalStack = new Stack<Item>();

        for (int i = 0; i < container.size(); i++) {
            Item current = copyStack.pop();

            current.increasePrice(percent);

            middleStack.push(current);

        }

        for (int i = 0; i < container.size(); i++) {
            Item current = middleStack.pop();

            finalStack.push(current);
        }


        this.container = (Stack<Item>) finalStack.clone();


    }

    /**
     * уменьшает сумму на опрееденные процент
     *
     * @param percent процент, на который упеньшаеться сумма
     */
    public void decreaseSum(float percent) {
        Stack<Item> copyStack = (Stack<Item>) container.clone();
        Stack<Item> middleStack = new Stack<Item>();
        Stack<Item> finalStack = new Stack<Item>();

        for (int i = 0; i < container.size(); i++) {
            Item current = copyStack.pop();

            current.decreasePrice(percent);

            middleStack.push(current);

        }

        for (int i = 0; i < container.size(); i++) {
            Item current = middleStack.pop();

            finalStack.push(current);
        }

        this.container = finalStack;

    }

    /**
     * выводит сумму твовара в корзине
     */
    public void showPrice() {
        System.out.println(this.generalCartPrice);
    }


}
