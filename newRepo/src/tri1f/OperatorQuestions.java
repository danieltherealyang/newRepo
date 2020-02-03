package tri1f;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
	/**
	 * 
	 * This class asks a set of 5 questions about operators (&&, ||, &, |, ^) 
	 * in a randomized question order and randomized answer choice order. 
	 * Short circuit meaning: minimal evaluation. If an AND statement has two conditions. If the first is false,
	 * then the second condition will not be checked.
	 * @author Daniel and Fox
	 * @see AnswerChoiceIndex
	 */
public class OperatorQuestions extends Question{
	public OperatorQuestions()
    {
    	setupQuestionData();
    	setupQuestion();
    }
	
	
	protected void setupQuestionData() {
		ConsoleMethods.println("Operator Question setup Question Data Method");
		AnswerChoiceIndex indexClass = new AnswerChoiceIndex();
		Random rand = new Random();
		String[] array = new String[]{"logical AND short circuit", "logical OR short circuit", "boolean logical AND", "boolean logical OR", "None of them"};
		List<String> randArr = Arrays.asList(array);
		int randomQuestion = rand.nextInt(6);
		switch(randomQuestion){
		case 0:
			this.question = "What does && stand for?";
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index0 = indexClass.returnIndex(randArr, "logical AND short circuit");
			char Ans0 = indexClass.returnAns(Index0);
			
			this.answerKey = Ans0;
			this.answer = "logical AND short circuit";
			break;
		case 1:
			this.question = "What does || stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index1 = indexClass.returnIndex(randArr, "logical OR short circuit");
			char Ans1 = indexClass.returnAns(Index1);
			
			this.answerKey = Ans1;
			this.answer = "logical OR short circuit";
			break;
		case 2:
			this.question = "What does & stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index2 = indexClass.returnIndex(randArr, "boolean logical AND");
			char Ans2 = indexClass.returnAns(Index2);
			
			this.answerKey = Ans2;
			this.answer = "boolean logical AND";
			break;
			
		case 3:
			this.question = "What does | stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index3 = indexClass.returnIndex(randArr, "boolean logical OR");
			char Ans3 = indexClass.returnAns(Index3);
			
			this.answerKey = Ans3;
			this.answer = "boolean logical OR";
			break;
		case 4:
			this.question = "What does ^ stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index4 = indexClass.returnIndex(randArr, "None of them");
			char Ans4 = indexClass.returnAns(Index4);
			
			this.answerKey = Ans4;
			this.answer = "boolean logical OR";
			break;
		case 5:
			int i = rand.nextInt(6) + 1;
			int lower = i - 1; 
			int higher = i + 3;
			this.question = "if ( -1 < j < " + i + "|| j >= " + higher + ") { \n code \n } \n what is the range of values of j which this code runs";
			this.choiceA = "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.choiceB = "[" + rand.nextInt(13) + ", " + rand.nextInt(18) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.choiceC = "[0" + ", " + lower + "]" + "U" + "[" + higher + ", infinity)";
			this.choiceD = "[" + rand.nextInt(6) + ", " + rand.nextInt(10) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.choiceE = "[" + rand.nextInt(2) + ", " + rand.nextInt(30) + "]U"+ "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.answerKey = 'C';
			this.answer = this.choiceC;
		}
	}
}