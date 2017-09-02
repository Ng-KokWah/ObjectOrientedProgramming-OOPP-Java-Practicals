package q3;

public class Student {
	private String name;
	private int quizScore;
	private int numOfTakenQuiz;
	
	public Student(String name,int quizScore) {
		this.name = name;
		quizScore = 0;
		numOfTakenQuiz = 0;
	}
	
	public String getName() {
		return name;
	}
	
	
	public double getQuizScore() {
		return quizScore;
	}
	
	public int getNumOfQuiz() {
		return numOfTakenQuiz;
	}
	
	public int addQuiz(int score) {
		numOfTakenQuiz++;
		return this.quizScore += score;
	}
	
	public double getTotalScore() {
		return this.quizScore;
	}
	
	public double getAverageScore() {
		return this.quizScore / this.numOfTakenQuiz;
	}
}
