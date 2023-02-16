public class Main {
    public static void main(String[] args) {
        Academician a1 = new Academician("Fehmi Bardak", "05365654253", "fehmibardak@gmail.comm","electric","associate professor");
        LabAssistant as1 = new LabAssistant("Esra Kaya", "52524546855", "eskaya64@gmail.comm", "ceng", "assistant","15.30");
        SecurityGuard s1 = new SecurityGuard("Ali Veli", "4950", "aliveli4950@maili.com", "security guard", "12","no doc");
        s1.watch();
        s1.work();
        as1.attendLesson();
        a1.attendLesson();


    }

}