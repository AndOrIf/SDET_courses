package HomeWork1_1;

abstract class Pizza {

    private final String name;
    protected double price;


    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void prepareIngredients();
    public abstract void pizzaInfo();

    public static void pizzeriaInfo() {
        System.out.println("Благодарим, что выбрали нашу пиццерию!");
    }

}
