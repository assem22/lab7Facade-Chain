package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;

import java.util.Scanner;

public abstract class Step {

    protected Scanner in = new Scanner(System.in);


    protected Step supervisor;

    public Step setNextStep(Step supervisor) {
        this.supervisor = supervisor;
        return supervisor;
    }

    public abstract void processHandler(Applicant applicant);
}
