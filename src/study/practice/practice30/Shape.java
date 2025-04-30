package study.practice.practice30;

public class Shape {


	class Circle {
		int radius;
		final double PI = 3.14;

		void setRadius(int radius) {
			this.radius = radius;
		}

		double getArea() {
			return radius * radius * PI;
		}
	}

	class Rectangle {
		int width;
		int height;

		Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}

		int getArea() {
			return width * height;
		}
	}

	class Triangle {
		int base;
		int height;

		void setSize(int base, int height) {
			this.base = base;
			this.height = height;
		}

		double getArea() {
			return (double)base * height / 2;
		}
	}



}
