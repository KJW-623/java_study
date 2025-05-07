package study.practice.practice36;

import java.util.List;

class Order {
    int orderNum;
    List<Menu> menus;

    // 생성자
    public Order(int i, List<Menu> list) { 
        orderNum = i;
        menus = list;
    }

    public int totalPrice() {
        int total = 0;
        for (Menu menu : menus) {
            total += menu.price;
        }
        return total;
    }
}
