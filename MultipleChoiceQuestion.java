package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	String questionText;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String answer;
	
	public MultipleChoiceQuestion(String questionText, String a, String b, String c, String d, String answerInput) {
		this.questionText = questionText;
		this.optionA = a;
		this.optionB = b;
		this.optionC = c;
		this.optionD = d;
		this.answer = answerInput.toUpperCase();
	}
	
	@Override
	public String getTheQuestionText() {
		String textWithOptions = (questionText+"\n(enter only the letter)\n"+optionA+"\n"+optionB+"\n"+optionC+"\n"+optionD);
		return textWithOptions;
	}

	@Override
	public boolean isCorrectAnswer(String guess) {
		guess = guess.toUpperCase();
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
