package edu.unca.csci201;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Quiz {
	
	int numberOfQuestions = 0;
	double correctAnswers = 0;
	int incorrectAnswers =0;
	//Question[] myQuestions = new Question[10];
	List<Question> myQuestionsList = new ArrayList<Question>();	
	List<Question> incorrectlyAnsweredQuestionsList = new ArrayList<Question>();

	
	public void addQuestion(Question q) {
		myQuestionsList.add(q);
		numberOfQuestions++;
	}
	
	public double giveQuiz() {
		
		Question[] myQuizQuestionsArray = new Question[(numberOfQuestions-1)];
		myQuizQuestionsArray = myQuestionsList.toArray(myQuizQuestionsArray);
		Scanner scan = new Scanner(System.in);
		for(Question q : myQuizQuestionsArray) {
			System.out.println("\n"+ q.getTheQuestionText());
			String guess = scan.nextLine();
			if(q.isCorrectAnswer(guess)) {
				System.out.println("Correct");
				correctAnswers++;
			}
			else {
				System.out.println("Incorrect");
				incorrectAnswers++;
				incorrectlyAnsweredQuestionsList.add(q);
			}
		}
		scan.close();
		System.out.println("\n************\nRESULTS\nNumber correct: "+correctAnswers);
		System.out.println("Number of questions: "+numberOfQuestions);
		double score = ((correctAnswers/numberOfQuestions)*100);
		return score;
		
	}
	
	public void showIncorrectlyAnsweredQuestions() {
		System.out.println("\n************\nHere are the questions you got wrong, and their solutions:\n");
		Question[] incorrectlyAnsweredQuestionsArray = new Question[incorrectlyAnsweredQuestionsList.size()];
		incorrectlyAnsweredQuestionsArray = incorrectlyAnsweredQuestionsList.toArray(incorrectlyAnsweredQuestionsArray);

		for(Question q: incorrectlyAnsweredQuestionsArray) {
			System.out.println("\n"+q.getTheQuestionText()+"\nThe Correct Answer is: "+q.getCorrectAnswer()+"\n");
       
		}
		
	}

	
}

