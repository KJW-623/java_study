package study.practice.practice45;

public class Cup extends KitchenSpace {

    private int capacity;
    private String material;
    private String color;

    public Cup(double squareFootage, String wallpaperColor, double floorHeight, int capacity, String material, String color) {
        super(squareFootage, wallpaperColor, floorHeight);
        if (capacity <= 0) {
            throw new IllegalArgumentException("컵 용량은 양수여야 합니다.");
        }
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("컵 재질을 입력해야 합니다.");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("컵 색상을 입력해야 합니다.");
        }
        this.capacity = capacity;
        this.material = material;
        this.color = color;
    }
    
    public int getCapacity() {
        return capacity;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }


}