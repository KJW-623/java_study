package study.practice.practice45;

public class Trash extends KitchenSpace {

    private int capacity;
    private String color;
    private double fillPercentage;

    public Trash(double squareFootage, String wallpaperColor, double floorHeight, int capacity, String color) {
        super(squareFootage, wallpaperColor, floorHeight);
        if (capacity <= 0) {
            throw new IllegalArgumentException("쓰레기통 용량은 양수여야 합니다.");
        }
        this.capacity = capacity;
        this.color = color;
        this.fillPercentage = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public double getFillPercentage() {
        return fillPercentage;
    }

    public void fill(double fillAmountPercentage) {
        if (fillAmountPercentage > 0) {
            this.fillPercentage = Math.min(100, this.fillPercentage + fillAmountPercentage);
            System.out.printf("쓰레기를 채웁니다. 현재 용량: %.2f%%\n", this.fillPercentage);
        } else if (fillAmountPercentage < 0) {
            System.out.println("음수 값으로 채울 수 없습니다.");
        }
    }

    public void open() {
        System.out.println("쓰레기통을 엽니다.");
    }

    public void close() {
        System.out.println("쓰레기통을 닫습니다.");
    }

    public void empty() {
        this.fillPercentage = 0;
        System.out.println("쓰레기통을 비웁니다. 현재 용량: 0%");
    }

 
}