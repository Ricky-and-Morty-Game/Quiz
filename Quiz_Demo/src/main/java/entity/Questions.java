package entity;

import jakarta.persistence.*;

@Entity
public class Questions {
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "Question")
    private String question;
    @Basic
    @Column(name = "AnswerA")
    private String answerA;
    @Basic
    @Column(name = "AnswerB")
    private String answerB;
    @Basic
    @Column(name = "AnswerC")
    private String answerC;
    @Basic
    @Column(name = "AnswerD")
    private String answerD;
    @Basic
    @Column(name = "CorrectAns")
    private char correctAns;

    public int getId() {
        return id;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswerA() {
        return answerA;
    }
    public String getAnswerB() {
        return answerB;
    }
    public String getAnswerC() {
        return answerC;
    }
    public String getAnswerD() {
        return answerD;
    }
    public char getCorrectAns() {
        return correctAns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Questions questions = (Questions) o;

        if (id != questions.id) return false;
        if (question != null ? !question.equals(questions.question) : questions.question != null) return false;
        if (answerA != null ? !answerA.equals(questions.answerA) : questions.answerA != null) return false;
        if (answerB != null ? !answerB.equals(questions.answerB) : questions.answerB != null) return false;
        if (answerC != null ? !answerC.equals(questions.answerC) : questions.answerC != null) return false;
        if (answerD != null ? !answerD.equals(questions.answerD) : questions.answerD != null) return false;
        if (correctAns != questions.correctAns) return false;

        return true;
    }

}
