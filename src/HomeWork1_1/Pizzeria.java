package HomeWork1_1;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza.pizzeriaInfo();

        Margherita margherita = new Margherita(30, "Тонкое", 2);
        margherita.calculatePrice();
        margherita.pizzaInfo();
        margherita.prepareIngredients();
        margherita.cook();
        margherita.deliver();

//        Pepperoni pepperoni = new Pepperoni(35, "Традиционное", 4);
//        pepperoni.calculatePrice();
//        pepperoni.pizzaInfo();
//        pepperoni.prepareIngredients();
//        pepperoni.cook();
//        pepperoni.deliver();
    }
}
