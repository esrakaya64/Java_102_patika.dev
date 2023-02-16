public class Employee {
    private String nameSurname;
    private String mpno;
    private String email;

    public Employee(String nameSurname, String mpno, String email) {
        this.nameSurname = nameSurname;
        this.mpno = mpno;
        this.email = email;
    }
    public void logIn(){
        System.out.println(this.nameSurname + " is log in");
    }
    public void logOut(){
        System.out.println(this.nameSurname + " is log out");
    }
    public void diningHall(){
        System.out.println(this.nameSurname + " is log in dining hall");
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getNameSurname() {
        return nameSurname;
    }
}
