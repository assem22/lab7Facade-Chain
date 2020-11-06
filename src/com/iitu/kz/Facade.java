package com.iitu.kz;

import com.iitu.kz.chainOfResponsibility.*;

public class Facade {

    public void startProcess(String firstName, String lastName, String email){
        Applicant applicant = new Applicant(firstName, lastName, email);
        Step consultation = new Consultation();
        consultation.setNextStep(new Documents()).setNextStep(new EnglishTest())
                .setNextStep(new KazakhTest()).setNextStep(new SpecializationTest())
                .setNextStep(new Interview());
        consultation.processHandler(applicant);
        System.out.println("Congratulations, "+ applicant.getFirstName() +"!\n" +
                "All processes are over!\n" +
                "You can see your results below:");
        if (applicant.getCertificateType().equals(CertificateType.NONE)){
            System.out.println("The English test score: " + applicant.getEnglishTestScore());
        }
        System.out.println("The Kazakh test score: " + applicant.getKazakhTestScore());
        System.out.println("The specialization test score: " + applicant.getSpecTestScore());
    }
}
