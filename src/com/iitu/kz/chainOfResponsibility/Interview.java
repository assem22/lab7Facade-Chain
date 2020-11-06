package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;
import com.iitu.kz.Question;

import java.util.ArrayList;
import java.util.List;

public class Interview extends Step{
    private final List<Question> interviewQuestions = new ArrayList<>();

    @Override
    public void processHandler(Applicant applicant) {
        questions();

        System.out.println("\nSTEP 5: Interview. Answer to the questions below: \n");

        for (Question question: interviewQuestions) {
            System.out.println(question.getQuestion());
            System.out.println("Your answer: ");
            String answer = in.nextLine();
            question.setAnswer(answer);
        }
        applicant.setInterview(interviewQuestions);

        if(supervisor != null) {
            supervisor.processHandler(applicant);
        }
    }

    private void questions() {
        interviewQuestions.add(new Question("1. Why do you want to attend this university?"));
        interviewQuestions.add(new Question("2. Why do you want to study this subject?"));
        interviewQuestions.add(new Question("3. What achievement are you most proud of?"));
        interviewQuestions.add(new Question("4. What do you like to do in your spare time?"));
    }
}
