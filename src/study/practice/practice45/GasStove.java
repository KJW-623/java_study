package study.practice.practice45;

public class GasStove extends KitchenSpace {

    private int burnerCount;
    private String brand;
    private int price;
    private boolean[] on;
    private int[] level;

    public GasStove(double squareFootage, String wallpaperColor, double floorHeight, int burnerCount, String brand, int price) {
        super(squareFootage, wallpaperColor, floorHeight);
        this.burnerCount = burnerCount;
        this.brand = brand;
        this.price = price;
        this.on = new boolean[burnerCount];
        this.level = new int[burnerCount];
    }

    public int getBurnerCount() {
        return burnerCount;
    }
    public String getBrand() {
        return brand;
    }
    public int getPrice() {
        return price;
    }

    public void powerOn(int burnerIndex) {
        if (isValidBurner(burnerIndex)) {
            on[burnerIndex] = true;
            level[burnerIndex] = 1;
            System.out.println((burnerIndex + 1) + "번 화구 점화, 세기: " + level[burnerIndex]);
        } else {
            System.out.println("화구 번호 오류");
        }
    }

    public void powerOff(int burnerIndex) {
        if (isValidBurner(burnerIndex)) {
            on[burnerIndex] = false;
            level[burnerIndex] = 0;
            System.out.println((burnerIndex + 1) + "번 화구 소화");
        } 
    }

    public void setPowerLevel(int burnerIndex, int level) {
        if (isValidBurner(burnerIndex)) {
            if (on[burnerIndex]) {
                this.level[burnerIndex] = level;
                System.out.println((burnerIndex + 1) + "번 화구 세기 조절: " + level);
            } else {
                System.out.println((burnerIndex + 1) + "번 화구 꺼짐");
            }
        }
    }

    private boolean isValidBurner(int index) {
        return index >= 0 && index < burnerCount;
    }
}