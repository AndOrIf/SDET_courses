package HomeWork1_1;

class Margherita extends Pizza implements ICookable, IDeliverable, ICalculatePrice {

    private final String doughType;

    private int cookingTime = 5;
    private int deliverTime = 3;
    private final int count;
    private final int size;

    public Margherita(int size,  String doughType, int count) {
        super("Маргарита", 699.99);
        this.size = size;
        this.doughType = doughType;
        this.count = count;
    }

    public int getSize() {
        return size;
    }
    public String getDoughType() {
        return doughType;
    }
    public int getCount() {
        return count;
    }

    @Override
    public void calculatePrice() { // Много if`ов (((
        try {
            System.out.println("Вычисляем стоимость заказа...");
            if (getSize() == 25) {
                setPrice(getPrice() + 0);
            } else if (getSize() == 30) {
                setPrice(getPrice() + 149.99);
            } else if (getSize() == 35) {
                setPrice(getPrice() + 299.99);
            } else throw new Exception();
        }
        catch (Exception e) {
            System.out.println("Пожалуйста, выбирите 1 из 3 доступных размеров - 25,30,35 см");
            System.exit(1);
        }
        setPrice(getPrice() * getCount());
    }

    @Override
    public void pizzaInfo(){
        System.out.println("Вы выбрали:\nПицца - " + getName() + "\n" + getCount() + " шт.\nРазмер - " + getSize() + " см\nТесто - " + getDoughType() + "\nСтоимость заказа: " + getPrice() + "\nСпасибо за заказ!");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Подготавливаем " + doughType + " тесто, соусы, и другие ингредиенты..." );
    }

    @Override
    public void cook() {
        System.out.println("Готовим вашу Маргариту!");
        while (cookingTime > 0) {
            System.out.println("Время до приготовления: " + cookingTime + " сек");
            cookingTime--;
        }
        System.out.println("Пицца готова! Передаем ее курьеру.");
    }

    @Override
    public void deliver(){
        System.out.println("Отправляем пиццу по адресу!");
        while (deliverTime > 0) {
            System.out.println("Доставляем!: " + deliverTime + " сек");
            deliverTime--;
        }
        System.out.println("Пицца доставлена, пожалуйста оставьте свой отзыв!");
    }
}