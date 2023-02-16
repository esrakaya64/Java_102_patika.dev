public class Lecturer extends Academician{
    private String doorNo;

    public Lecturer(String nameSurname, String mpno, String email, String dpartment, String title, String doorNo) {
        super(nameSurname, mpno, email, dpartment, title);
        this.doorNo = doorNo;
    }
    public void meeting(){
        System.out.println(this.getNameSurname() + " is at the meeting");
    }
    public void makeExam(){
        System.out.println(this.getNameSurname() + "is making an exam now");
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
}
