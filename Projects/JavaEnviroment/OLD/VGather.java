import java.lang.Math;

public class VGather {
	public static void main(String[] args) {
		int numberOfStudents = Comp122.getInt("How Many Students in Class?");
		Student[] studentArray = new Student[numberOfStudents];
		int grade;
		
		for (int i = 0; i < numberOfStudents; i++) {
			grade = Comp122.getInt("Enter a grade:");
			studentArray[i].updateGrade(grade);
		}
		double average = 0;
		double temp = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			temp = studentArray[i].grade;
			average += temp;
		}
		if (average != 0) {
			temp = numberOfStudents;
			double calcAvg = average / temp;
			temp = calcAvg * 100;
			int roundedAvg = (int) Math.round(temp);
			int roundedAvg = (int) Math.round(temp);
			temp = roundedAvg;
			calcAvg = temp / 100;
			System.out.println(calcAvg);
		}
	}
}