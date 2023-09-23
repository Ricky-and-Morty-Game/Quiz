import entity.Questions;
import jakarta.persistence.*;

import java.util.Scanner;
import java.util.logging.Level;

public class Play extends ScoreManager {
    public static void main(String[] args) {
        //Entity manager used to communicate with SQL database to grab pre-constructed questions
        //Make sure to set up the persistence.xml with a local copy of the questions database, otherwise the demo will not work
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.WARNING);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        //The three variables used by the program + the input Scanner.
        Scanner userInput = new Scanner(System.in);
        int score = 0; //Keeps track of the player's score
        int selector = 1; //Used to select the question. Currently follows linear path, but change to randomized later in project
        char userAns; // The char representing the player's answer. Is scanned in with the scanner

        try {
            transaction.begin();
            //This loop will run until the final question. Current demo only has three questions, so loop runs thrice
            //(Will be changed later to accommodate more questions)
            while(selector < 4) {
                //A quick query that grabs a question from the database and puts it into a question entity object
                //The SQL used to build the database for this demo is included in the resources folder
                TypedQuery<Questions> grabQuestion = entityManager.createQuery("SELECT q FROM Questions q WHERE id =" + selector, Questions.class);
                Questions question = grabQuestion.getSingleResult();
                //The next bloc of code controls the gameplay. Will be expanded in the future once web applet integration is implemented
                DisplayQuestions(selector, question);
                userAns = userInput.next().charAt(0);
                score = CheckAns(userAns, question, score);
                selector++;
            }
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
        //Finally, close the entity manager and scanner, and print out final score
        entityManager.close();
        entityManagerFactory.close();
        userInput.close();
        System.out.println("Final score is "+ score);
    }
}
