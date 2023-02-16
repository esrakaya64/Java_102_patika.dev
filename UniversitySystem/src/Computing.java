public class Computing extends Officer{
    private String duty;

    public Computing(String nameSurname, String mpno, String email, String dep, String shift, String duty) {
        super(nameSurname, mpno, email, dep, shift);
        this.duty = duty;
    }
    public void networkSetup(){
        System.out.println("Network setup is maked");
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
