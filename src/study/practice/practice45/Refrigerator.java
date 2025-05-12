package study.practice.practice45;

public class Refrigerator extends KitchenSpace {

	private String brand;
	private int liter; // 리터
	private boolean powerOn;
	private int temperature;
	private int doorCount;
	private IceTray iceTray; // 얼음 트레이는 있을 수도, 없을 수도 있음
	private static int DEFAULT_TEMP = 3;

	public Refrigerator(double squareFootage, String wallpaperColor, double floorHeight, String brand, int liter, int doorCount, boolean hasIceTray) {
		super(squareFootage, wallpaperColor, floorHeight);
		this.brand = brand;
		this.liter = liter;
		this.powerOn = false;
		this.temperature = DEFAULT_TEMP;
		this.doorCount = doorCount;
		if (hasIceTray) {
			this.iceTray = new IceTray(12, 5000);
		} else {
			this.iceTray = null;
		}
	}

	public String getBrand() {
		return brand;
	}

	public int getLiter() {
		return liter;
	}

	public boolean isPowerOn() {
		return powerOn;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public IceTray getIceTray() {
		return iceTray;
	}

	public void turnOn() {
		this.powerOn = true;
		System.out.println("냉장고 전원을 켭니다.");
	}

	public void turnOff() {
		this.powerOn = false;
		System.out.println("냉장고 전원을 끕니다.");
	}

	public void temperatureUp() {
		if (powerOn) {
			this.temperature++;
			System.out.println("온도를 올립니다. 현재 온도: " + this.temperature + "℃");
		} else {
			System.out.println("전원이 꺼져 있어 온도를 조절할 수 없습니다.");
		}
	}

	public void temperatureDown() {
		if (powerOn) {
			this.temperature--;
			System.out.println("온도를 내립니다. 현재 온도: " + this.temperature + "℃");
		} else {
			System.out.println("전원이 꺼져 있어 온도를 조절할 수 없습니다.");
		}
	}
}

class IceTray {
	private int holeCount;
	private int price;

	public IceTray(int holeCount, int price) {
		this.holeCount = holeCount;
		this.price = price;
	}
	public int getHoleCount() {
		return holeCount;
	}
	public int getPrice() {
		return price;
	}
}