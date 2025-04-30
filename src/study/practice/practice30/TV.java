package study.practice.practice30;

public class TV {

	String company;
	int year;
	int inch;
		
	TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	//메소드
	void show() {
		System.out.print(company + "제품 ");
		System.out.print(year + "년형 ");
		System.out.print(inch + "인치 TV ");
		System.out.println();
			
		}

}
