public class LabAssistant extends Assistant{
    public LabAssistant(String nameSurname, String mpno, String email, String dpartment, String title, String officeHour) {
        super(nameSurname, mpno, email, dpartment, title, officeHour);
    }
    public void attendLab(){
        System.out.println(this.getNameSurname() + " is attended lab");
    }
    public void attendLesson(){
        System.out.println(this.getNameSurname() + " is attended lesson");
    }
}
