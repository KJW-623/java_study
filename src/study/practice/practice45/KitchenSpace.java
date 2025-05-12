package study.practice.practice45;

public class KitchenSpace {

    double squareFootage;
    String wallpaperColor;
    double floorHeight;

    public KitchenSpace(double squareFootage, String wallpaperColor, double floorHeight) {
        this.squareFootage = squareFootage;
        this.wallpaperColor = wallpaperColor;
        this.floorHeight = floorHeight;
    }
    
    public double getSquareFootage() {
        return squareFootage;
    }
    public String getWallpaperColor() {
        return wallpaperColor;
    }
    public double getFloorHeight() {
        return floorHeight;
    }

 
}