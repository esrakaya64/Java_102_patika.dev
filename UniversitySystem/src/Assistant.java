public class Assistant extends Academician{
    private String officeHour;

    public Assistant(String nameSurname, String mpno, String email, String dpartment, String title, String officeHour) {
        super(nameSurname, mpno, email, dpartment, title);
        this.officeHour = officeHour;
    }
    public void makeQuiz(){
        System.out.println(this.getNameSurname() + "is making a quiz now");
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }
}
