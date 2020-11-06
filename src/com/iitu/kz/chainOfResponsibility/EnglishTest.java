package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;
import com.iitu.kz.CertificateType;
import com.iitu.kz.Question;
import com.iitu.kz.chainOfResponsibility.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnglishTest extends Step {
    private final List<Question> englishTest = new ArrayList<>();
    private final Random generate = new Random();

    @Override
    public void processHandler(Applicant applicant) {
        if (applicant.getCertificateType() == CertificateType.NONE){
            generateTest();
            Question question;
            String answer;
            int score = 0;

            System.out.println("\nSTEP 2: English language test. Answer to the questions below: \n");

            for (int i=0; i<3; i++) {
                question = englishTest.get(generate.nextInt(englishTest.size()));
                System.out.println(question.getQuestion());
                answer = in.next();
                if (answer.equals(question.getAnswer())){
                    score++;
                }
                englishTest.remove(question);
            }
            applicant.setEnglishTestScore(score);
            System.out.println("Your score: " + score);
        }else{
            System.out.println("\nSTEP 2: You are exempt from the english test because you have a "
                    + applicant.getCertificateType() + " certificate");
        }
        if(supervisor != null) {
            supervisor.processHandler(applicant);
        }
    }

    private void generateTest() {
        englishTest.add(new Question("I've ______ a terrible headache.\n" +
                "a: have\nb: gets\nc: gottin\nd: got\ne: has","d"));
        englishTest.add(new Question("Paul can't touch the ceiling because he is too ______.\n" +
                "a: shortening\nb: shortness\nc: shorten\nd: shortly\ne: short","e"));
        englishTest.add(new Question("The little dog ______ my leg.\n" +
                "a: bited\nb: bitted\nc: bit\nd: bitten\ne: bite","c"));
        englishTest.add(new Question("I'm sorry, you will just have to ______.\n" +
                "a: wait\nb: avoid\nc: like\nd: attempt\ne: find","a"));
        englishTest.add(new Question("Never look directly ______ the sun. It is bad for your eyes.\n" +
                "a: to\nb: for\nc: through\nd: of\ne: at","e"));
    }
}
