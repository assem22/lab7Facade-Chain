package com.iitu.kz;

import java.util.ArrayList;
import java.util.List;

public class Applicant {
    private String firstName;
    private String lastName;
    private String email;

    private boolean form086;
    private int scoreOfENT;
    private CertificateType certificateType;
    private int englishTestScore;
    private int kazakhTestScore;
    private int specTestScore;
    private List<Question> interview;

    public Applicant(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.certificateType = CertificateType.NONE;
        this.interview = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScoreOfENT() {
        return scoreOfENT;
    }

    public void setScoreOfENT(int scoreOfENT) {
        this.scoreOfENT = scoreOfENT;
    }

    public CertificateType getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(CertificateType certificateType) {
        this.certificateType = certificateType;
    }

    public int getEnglishTestScore() {
        return englishTestScore;
    }

    public void setEnglishTestScore(int englishTestScore) {
        this.englishTestScore = englishTestScore;
    }

    public int getKazakhTestScore() {
        return kazakhTestScore;
    }

    public void setKazakhTestScore(int kazakhTestScore) {
        this.kazakhTestScore = kazakhTestScore;
    }

    public int getSpecTestScore() {
        return specTestScore;
    }

    public void setSpecTestScore(int specTestScore) {
        this.specTestScore = specTestScore;
    }

    public List<Question> getInterview() {
        return interview;
    }

    public void setInterview(List<Question> interview) {
        this.interview = interview;
    }

    public boolean isForm086() {
        return form086;
    }

    public void setForm086(boolean form086) {
        this.form086 = form086;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", scoreOfENT=" + scoreOfENT +
                ", certificateType=" + certificateType +
                ", englishTestScore=" + englishTestScore +
                ", kazakhTestScore=" + kazakhTestScore +
                ", specTestScore=" + specTestScore +
                '}';
    }
}
