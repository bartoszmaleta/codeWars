package javaExe.kyu7;

public class FIXMEGetFullName {
    private String firstName;
    private String lastName;

    public FIXMEGetFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName.equals("")) {
            return lastName;
        }
        if (lastName.equals("")) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public String getFullName3() {
        return firstName.equals("") ? lastName : lastName.equals("") ? firstName : firstName + " " + lastName;
    }

    public String getFullName2() {
        return (firstName + " " + lastName).trim();
    }

    public static void main(String[] args) {
        FIXMEGetFullName fixmeGetFullName = new FIXMEGetFullName("Clink", "East");
        System.out.println(fixmeGetFullName.getFullName());
        System.out.println(fixmeGetFullName.getFullName3());
    }
}
