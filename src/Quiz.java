public class Quiz {
	//Data member
	private int id;
	private Student student;
	private int totalScore;
	private int maxScore;

	/* Constructor */
	public Quiz(int id, Student student, int totalScore, int maxScore) {
		this.id = id;
		this.student = student;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
	}

	public double grade() {
		return (double) ((this.totalScore*100) / this.maxScore);
	}

	public static void main(String[] args) {
		/* Create and assign  a name for new student*/
		Student student = new Student("Joson, Judeia M");
		System.out.println(student.getName());


		int totalScore = 0;
		int maxScore = 0;


		/* Create and assign a value to quiz 1.*/
		Quiz quiz1 = new Quiz(1, student, 10, 15);
		totalScore += quiz1.totalScore;
		maxScore += quiz1.maxScore;
		System.out.println("Quiz 1: Score: "+quiz1.totalScore);

		/* Create and assign another value to quiz 2*/
		Quiz quiz2 = new Quiz(2, student, 18, 20);
		totalScore += quiz2.totalScore;
		maxScore += quiz2.maxScore;
		System.out.println("Quiz 2: Score: "+quiz2.totalScore);

		/* Output the information*/
		double totalGrade = ((double) totalScore / maxScore)*100;
		System.out.println("\nTotal grade: " + totalGrade);
	}


}
