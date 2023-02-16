public class Officer extends Employee{
    private String dep;
    private String shift;

    public Officer(String nameSurname, String mpno, String email, String dep, String shift) {
        super(nameSurname, mpno, email);
        this.dep = dep;
        this.shift = shift;
    }
    public void work(){
        System.out.println(this.getNameSurname() + "is working");
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
