package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;
import com.iitu.kz.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpecializationTest extends Step{
    private final List<Question> specTest = new ArrayList<>();
    private final Random generate = new Random();

    @Override
    public void processHandler(Applicant applicant) {
        generateSpecTest();
        Question question;
        String answer;
        int score = 0;

        System.out.println("\nSTEP 4: Specialization test. Answer to the questions below: \n");

        for (int i=0; i<3; i++) {
            question = specTest.get(generate.nextInt(specTest.size()));
            System.out.println(question.getQuestion());
            answer = in.next();
            if (answer.equals(question.getAnswer())){
                score++;
            }
            specTest.remove(question);
        }
        applicant.setSpecTestScore(score);
        System.out.println("Your score: " + score);

        if(supervisor != null) {
            supervisor.processHandler(applicant);
        }
    }

    private void generateSpecTest() {
        specTest.add(new Question("The physical components of a computer is referred to as\n" +
                "a: Hardware\nb: Software\nc: Peopleware\nd: Electronic","a"));
        specTest.add(new Question("Computer programs that makes the computer work\n" +
                "a: Hardware\nb: Software\nc: Peopleware\nd: Electronic","b"));
        specTest.add(new Question("It is referred as the brain of the computer.\n" +
                "a: Output device\nb: Memory\nc: Input device\nd: CPU\ne: Process","d"));
        specTest.add(new Question("The type of memory that storage is not erased even if computer is turned off is called\n" +
                "a: RAM\nb: ROM\nc: CPU\nd: ALU\ne: MU","b"));
        specTest.add(new Question("The working memory that is used for primary storage is referred to as\n" +
                "a: RAM\nb: ROM\nc: CPU\nd: ALU\ne: MU","a"));
    }
}
