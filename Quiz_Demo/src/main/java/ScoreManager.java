import entity.Questions;

public class ScoreManager {

    //Method to check if an answer is correct, and to increment score if it is
    public static int CheckAns (char ans, Questions q, int score){
        if (Character.toLowerCase(ans) == Character.toLowerCase(q.getCorrectAns())){
            System.out.println("Correct!\n");
            return score + 1;}
        else{
            System.out.println("Incorrect!\n");
            return score;}
    }
    //Method to print out the game text
    public static void DisplayQuestions (int counter, Questions q){
        System.out.println("Here is question number " + counter + "!\n" + q.getQuestion());
        System.out.println("\nA. " + q.getAnswerA() + "\nB. " + q.getAnswerB() +"\nC. " + q.getAnswerC() +"\nD. " + q.getAnswerD());
        System.out.println("\nWhat is your answer? (Enter in a single letter)");
    }


}
