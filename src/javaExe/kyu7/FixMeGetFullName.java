package javaExe.kyu7;

public class FixMeGetFullName {

    private String firstName;
    private String lastName;

    public FixMeGetFullName(String firstName, String lastName) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }

    public String getFullName() {
        if (firstName.equals("") || lastName.equals("")) return "";
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        FixMeGetFullName fixMeGetFullName = new FixMeGetFullName("Qwer", "Zxc");
        System.out.println(fixMeGetFullName.getFullName());
    }

}
