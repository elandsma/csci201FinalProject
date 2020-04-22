package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		Quiz myQuiz = new Quiz();		
		Question question1 = new TrueFalseQuestion("Ewoks are bipedal", "t");
		Question question2 = new TrueFalseQuestion("Sith do not deal in absolutes", "f");
		Question question3 = new TrueFalseQuestion("The word \"Ewok\" is never actually spoken by any character in the Star Wars films", "t");
		Question question4 = new TrueFalseQuestion("Objectively speaking, \"The Empire Strikes Back\" is the best Star Wars movie", "T");
		Question question5 = new MultipleChoiceQuestion("What is the name of the swampy planet where Yoda trained Luke? ", "A: Tatooine", "B: Dagobah", "C: Naboo", "D: Yavin", "B");
		Question question6 = new MultipleChoiceQuestion("Which character is famous for the phease \"It's A Trap!\"", "A: Grand Moff Tarkin", "B: Darth Maul", "C: Han Solo", "D: Admiral Ackbar", "D");
		Question question7 = new MultipleChoiceQuestion("Who is the Ewok that princess Leia befriends?", "A: Wicket", "B: Paploo", "C: Logray", "D: Teebo", "A");
		Question question8 = new ShortAnswerQuestion("\"Do or do not, there is no ____\"", "try");
		Question question9 = new ShortAnswerQuestion("On what planet's moon do the Ewoks reside?", "Endor");
		Question question10 = new ShortAnswerQuestion("May the ____ be with you", "force");
		
		Question[] myQuestions = new Question[] {question1, question2, question3, question4, question5, question6, question7, question8, question9, question10};
		for(Question q : myQuestions) {
			myQuiz.addQuestion(q);
		}
		
		double myScore = myQuiz.giveQuiz();
		System.out.println("Your score is "+myScore);
		myQuiz.showIncorrectlyAnsweredQuestions();
		
	}

}
