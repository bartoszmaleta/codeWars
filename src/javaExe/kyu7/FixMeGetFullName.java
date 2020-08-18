package javaExe.kyu7;

public class FixMeGetFullName {

    private final String firstName;
    private final String lastName;

    public FixMeGetFullName(String firstName, String lastName) {
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
        FixMeGetFullName fixMeGetFullName = new FixMeGetFullName("Qwer", "Zxc");
        System.out.println(fixMeGetFullName.getFullName());
    }

}
