package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String [] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer,  points);  //calls question constructor method
		this.choices = choices;
		
		//FIXME
		
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	
	
	public String[] getChoices() {
		return choices;
	}


	public void setChoices(String[] choices) {
		this.choices = choices;
	}


	@Override
	public void displayPrompt() {
		System.out.println(this.getPrompt() + "(" + this.getPoints() + ")"); 
		for(int i=0; i<choices.length; i++) {
			System.out.println(choices[i]);
		}
		
		//FIXME
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
