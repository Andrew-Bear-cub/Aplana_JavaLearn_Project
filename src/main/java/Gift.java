//Класс candy от которого унаследую все остальные. У него три общих параметра, а один уникальный будет у каждого потомка свой
class Candy {
    String name;
    double price;
    double weight;

//Конструктор класса candy
    Candy(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}

//Один из дочерних классов. Суть у них у всех одинаковая, добавляется дополнительный атрибут, в конструкторе вызываем конструктор родителя
class Choko_candy extends Candy {
    private String type;

    Choko_candy(String name, double price, double weight, String type) {
        super(name, price, weight);
        this.type = type;
    }
//Переопределяем метод tostring для удобоваримого вывода в консоль
    @Override
    public String toString() {
        return "название конфеты: " + name + ", цена за штуку: " + price + ", общая цена: " + price * weight + ", вид шоколада: " + type;
    }
}

class Jelly_bean extends Candy {
    private String taste;

    Jelly_bean(String name, double price, double weight, String taste) {
        super(name, price, weight);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "название конфеты: " + name + ", цена за штуку: " + price + ", общая цена: " + price * weight + ", вкус мармелада: " + taste;
    }
}

class Lolipop extends Candy {
    private String shugar_free;

    Lolipop(String name, double price, double weight, String shugar_free) {
        super(name, price, weight);
        this.shugar_free = shugar_free;
    }

    @Override
    public String toString() {
        return "название конфеты: " + name + ", цена за штуку: " + price + ", общая цена: " + price * weight + ", содержит ли сахар?: " + shugar_free;
    }
}
//Класс мешок, для сбора подарка
class Gift_bag {

    private Choko_candy a = new Choko_candy("Mishka", 12.50, 300.00, "Milk chocolate");
    private Jelly_bean b = new Jelly_bean("Haribo", 25.20, 250.00, "Fruit mix");
    private Lolipop c = new Lolipop("Chupa Chups", 10.15, 150.00, "Нет");
    private double total_sum = a.price * a.weight + b.price * b.weight + c.price * c.weight;
    private double total_weight = a.weight + b.weight + c.weight;

    @Override
    public String toString() {
        return "Состав подарка: \n" + "\nОбщая цена подарка: " + total_sum + "\nОбщий вес подарка: " + total_weight + "\nСостав подарка: " + "\n" + a.toString() + "\n" + b.toString() + "\n" + c.toString();
    }
//в методе мейн создаем эксемпляр мешка и выводим его содержимое в консоль
    public static void main(String[] args) {
        Gift_bag bag = new Gift_bag();
        System.out.println(bag.toString());
    }
}

