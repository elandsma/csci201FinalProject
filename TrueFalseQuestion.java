package edu.unca.csci201;

public class TrueFalseQuestion implements Question {
	
	String questionText;
	String answer;
	
	public TrueFalseQuestion(String statement, String answerInput) {
		this.questionText = statement;
		this.answer = answerInput.toLowerCase();
	}
	
	@Override
	public String getTheQuestionText() {
		String questionToPresent = ("True or False: "+questionText+"\n(enter only the letter T or F)");
		return questionToPresent;
	}

	@Override
	public boolean isCorrectAnswer(String guess) {
		guess = guess.toLowerCase();
		if(guess.equals(answer)){
			return true;
		}
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		return answer;
	}

}
