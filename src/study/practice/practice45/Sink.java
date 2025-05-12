package study.practice.practice45;

public class Sink extends KitchenSpace {

    private double width;
    private double length;
    private double depth;
    private String color;
    private String material;

    public Sink(double squareFootage, String wallpaperColor, double floorHeight, double width, double length, double depth, String color, String material) {
        super(squareFootage, wallpaperColor, floorHeight);
        if (width <= 0 || length <= 0 || depth <= 0) {
            throw new IllegalArgumentException("싱크대의 가로, 세로, 깊이는 양수여야 합니다.");
        }
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.color = color;
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

}