package edu.unca.csci201;

public class ShortAnswerQuestion implements Question {

	String questionText;
	String answer;
	
	public ShortAnswerQuestion(String questionText, String answer) {
		this.questionText = questionText;
		this.answer = answer.toLowerCase();	
	}
	
	@Override
	public String getTheQuestionText() {
		return questionText;
	}

	@Override
	public boolean isCorrectAnswer(String guess) {
		guess = guess.toLowerCase();
		if(guess.equals(answer)) {
			return true;
		}
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		return answer;
	}

}
