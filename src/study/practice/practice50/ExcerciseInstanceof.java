package study.practice.practice50;

public class ExcerciseInstanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);

	}
 
	static void action(Robot r) {
        if (r instanceof DanceRobot) {
            DanceRobot dr = (DanceRobot) r;
            dr.dance();
        } else if (r instanceof SingRobot) {
            SingRobot sr = (SingRobot) r;
            sr.sing();
        } else if (r instanceof DrawRobot) {
            DrawRobot dor = (DrawRobot) r;
            dor.draw();
        }
    }
	
}
