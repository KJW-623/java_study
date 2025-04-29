package study.practice.practice27;

public class Person {
	
	//필드
	String name;
    String gender;
    int age;
    double height;
    double weight;
    String job;
    String bloodType;
    boolean isHealthy;
    boolean isSleeping;
	
	//생성자
    //생성자 선언하지 않으면? 기본생성자 자동 생성 
    //Person() {}
    
    //생성자 : 객체가 생성될 때 초기에 해야 할 일
    Person(){
    	name=null;
        gender= "남";
        age=0;;
        height=0;
        weight=0;
        job=null;
        bloodType=null;
        isHealthy = true;
        isSleeping = false;
    }
    
    Person(String name, String gender, int age, double height, double weight, 
    		String job, String bloodType, boolean isHealthy, boolean isSleeping) {
    	this.name = name;
    	this.gender = gender;
    	this.age = age;
    	this.height = height;
    	this.weight = weight;
    	this.job = job;
    	this.bloodType = bloodType;
    	this.isHealthy = isHealthy;
    	this.isSleeping = isSleeping;
    }
	
	
	//메소드
	void printPersonInfo() {
		System.out.println("이름:" + name);
		System.out.println("성별:" + gender);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
		System.out.println("몸무게:" + weight);
		System.out.println("직업:" + job);
		System.out.println("혈액형:" + bloodType);
		System.out.println("건강여부:" + isHealthy);
		System.out.println("수면중여부:" + (isSleeping ? "자는중" : "안자는중"));
		System.out.println();
	}
	

}
