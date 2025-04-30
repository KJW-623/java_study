package study.practice.practice30;

public class Circle {

	String company;
	int year;
	int inch;

	int radius;
	double PI = 3.14;

	void setRadius(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * PI;
	}


}
