package study.practice.practice47;

public class Food {
    String name;
    int price;

    Food(String name, int price){
        this.name = name;
        this.price = price;
    }

    void showFoodInfo() {
        System.out.println(name + ":" + price + "원");
    }
}
