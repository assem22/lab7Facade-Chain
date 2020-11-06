package com.iitu.kz.chainOfResponsibility;

import com.iitu.kz.Applicant;
import com.iitu.kz.Question;
import com.iitu.kz.chainOfResponsibility.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KazakhTest extends Step {
    private final List<Question> kazakhTest = new ArrayList<>();
    private final Random generate = new Random();

    @Override
    public void processHandler(Applicant applicant) {
        generateTest();
        Question question;
        String answer;
        int score = 0;

//        System.out.println("\nStep 3");
        System.out.println("\nSTEP 3: Kazakh language test. Answer to the questions below: \n");

        for (int i=0; i<3; i++) {
            question = kazakhTest.get(generate.nextInt(kazakhTest.size()));
            System.out.println(question.getQuestion());
            answer = in.next();
            if (answer.equals(question.getAnswer())){
                score++;
            }
            kazakhTest.remove(question);
        }
        applicant.setKazakhTestScore(score);
        System.out.println("Your score: " + score);

        if(supervisor != null) {
            supervisor.processHandler(applicant);
        }
    }


    private void generateTest() {
        kazakhTest.add(new Question("Тура мағыналы сөзді табыңыз.\n" +
                "a: Баспасөз – қоғамның құлағы, тілі.\nb: Ақпа құлаққа айтсаң, ағып кетеді." +
                "\nc: Құлақ етін жеді.\nd: Құлағым ауырып жүр.","d"));
        kazakhTest.add(new Question("Термин сөзді қатарды табыңыз.\n" +
                "a: Қасым ұста іске жарайды-ау деген мүйіздерді жинады.\nb: Сұрапыл дауылға төтеп беру қиын-ақ." +
                "\nc: Төртінші баптың бірінші тармағында қаралады.\n" +
                "d: Қарағым, қолыңнан келеді, зерттеушілікпен айналысқаның жөн.\n" +
                "e: Ініміздің пәтері төртінші қабатта.","c"));
        kazakhTest.add(new Question("Тасымалдауға келмейтін сөзді анықтаңыз.\n" +
                "a: Ойпат.\nb: Ирелең.\nc: Көлденең.\nd: Әрең.\ne: Тұлға.","d"));
        kazakhTest.add(new Question("Ауыспалы өткен шақты көрсетіңіз.\n" +
                "a: Терезелерге перде тұтылыпты.\nb: Тұрман екеуі Заманбектің жаңа отауын құттықтай барған.\n" +
                "c: Мұндай күндері сіркесі су көтермейтін.\nd: Есік алдына Нұрым келіп тоқтады.\n" +
                "e: Бейсен бүгін осыны сезіп келеді.","c"));
        kazakhTest.add(new Question("Күшейткіш үстеуді анықтаңыз.\n" +
                "a: Мүлдем, тіпті, тым.\nb: Әрең, бірден, босқа.\nc: Қасақана, орасан, нағыз.\n" +
                "d: Талай, ілгері, әрі.\ne: Шарасыздан, емін-еркін, әжептәуір.","a"));

    }
}
