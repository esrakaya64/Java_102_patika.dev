public class Academician extends Employee{
    private String department;
    private String title;

    public Academician(String nameSurname, String mpno, String email, String dpartment, String title) {
        super(nameSurname, mpno, email);
        this.department = dpartment;
        this.title = title;
    }
    public void attendLesson(){
        System.out.println(this.getNameSurname() + "  attended lesson");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
