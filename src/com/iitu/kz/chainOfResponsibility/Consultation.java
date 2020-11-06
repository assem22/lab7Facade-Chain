package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;
import com.iitu.kz.chainOfResponsibility.Step;

public class Consultation extends Step {

    @Override
    public void processHandler(Applicant applicant) {
        System.out.println("Welcome to IITU, " + applicant.getFirstName() + "!");
        System.out.println("Before your professional test you should submit your documents and " +
                "take an English proficiency test, if necessary.\nThen you will take a Kazakh proficiency test. " +
                "Finally, you will have some interview.\n" +
                "So you will pass thought 5 steps\n");
        if (supervisor != null){
            supervisor.processHandler(applicant);
        }
    }
}
