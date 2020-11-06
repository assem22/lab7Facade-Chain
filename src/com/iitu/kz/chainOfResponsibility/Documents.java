package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;
import com.iitu.kz.CertificateType;

public class Documents extends Step {

    @Override
    public void processHandler(Applicant applicant) {
        System.out.println("STEP 1: Documentation\n");
        System.out.println("Sumbit medical document form 086. (To submit enter \"sumbit\")");
        String medDoc = in.next();
        while(!medDoc.equals("submit")){
            System.out.println("Something went wrong... Enter again:");
            medDoc = in.next();
        }
        applicant.setForm086(true);

        System.out.println("Enter your ENT score");
        int score = in.nextInt();
        applicant.setScoreOfENT(score);
        System.out.println("Choose if you have any of them:\n" +
                "[1] TOEFL\n" +
                "[2] IELTS\n" +
                "[3] PTE_Academic\n" +
                "[4] BULATS\n" +
                "[5] None");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> applicant.setCertificateType(CertificateType.TOEFL);
            case 2 -> applicant.setCertificateType(CertificateType.IELTS);
            case 3 -> applicant.setCertificateType(CertificateType.PTE_Academic);
            case 4 -> applicant.setCertificateType(CertificateType.BULATS);
            case 5 -> applicant.setCertificateType(CertificateType.NONE);
        }

        if (supervisor != null){
            supervisor.processHandler(applicant);
        }
    }
}
