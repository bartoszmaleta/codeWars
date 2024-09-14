package javaExe.kyu7;

public class FixMeGetFullName2 {

    private final String firstName;
    private final String lastName;

    public FixMeGetFullName2(String firstName, String lastName) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }

    public String getFullName() {
        return firstName.equals("") ? lastName : lastName.equals("") ? firstName : (firstName + " " + lastName);
    }

    // SECOND OPTION
    public String getFullName2() {
        return (firstName + " " + lastName).trim();
    }

    public static void main(String[] args) {
        FixMeGetFullName2 fixMeGetFullName = new FixMeGetFullName2("Qwer", "Zxc");
        System.out.println(fixMeGetFullName.getFullName());
    }

}
