package study.practice.practice30;

public class Triangle {

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
