package study.practice.practice47;

import java.util.ArrayList;
import java.util.List;

public class FoodTruck {

	List<Food> menuList;

    FoodTruck(){
        menuList = new ArrayList<Food>();
    }
    void addMenu(String name, int price) {
        Food food = new Food(name, price);
        menuList.add(food);
    }
    void showMenu() {
        for(Food food : menuList) {
            food.showFoodInfo();
        }
    }
    
}
