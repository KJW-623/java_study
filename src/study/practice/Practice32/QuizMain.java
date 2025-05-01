package study.practice.Practice32;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Quiz quiz1 = new Quiz();
	        Quiz quiz2 = new Quiz("math", 2);
	        Quiz quiz3 = new Quiz("computer", 3);
	        Quiz quiz4 = new Quiz("history", 4);
	        Quiz quiz5 = new Quiz("history", 30);
	        Quiz quiz6 = new Quiz("history", 35);
	        System.out.println("퀴즈 최대 점수: " + Quiz.maxPoint);
	        quiz1.setNum(1);
	        quiz1.point = 10;
	        quiz1.printInfo(false);
	        quiz2.setPoint(5);
	        quiz2.printInfo(true);
	        quiz3.point = -5;
	        quiz3.printInfo(true);
	        quiz4.setPoint(-10);
	        quiz4.printInfo(false);
	        quiz5.setPoint(20);
	        quiz5.printInfo(true);
	        quiz6.setPoint(-20);
	        quiz6.printInfo(true);
	        
	}

}
