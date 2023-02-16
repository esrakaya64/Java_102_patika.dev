public class SecurityGuard extends Officer{
    private String document;

    public SecurityGuard(String nameSurname, String mpno, String email, String dep, String shift, String document) {
        super(nameSurname, mpno, email, dep, shift);
        this.document = document;
    }
    public void watch(){
        System.out.println(this.getNameSurname() + " is on watch");
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
