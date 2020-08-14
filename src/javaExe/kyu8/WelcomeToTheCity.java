package javaExe.kyu8;

public class WelcomeToTheCity {
    public String sayHello(String[] names, String city, String state){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        for (String name : names) {
            if (name.equals(names[names.length - 1])) {
                sb.append(name);
            } else {
                sb.append(name).append(" ");
            }
        }
        sb.append("! Welcome to ").append(String.format("%s, %s!", city, state));
        return sb.toString();
    }

    // SECOND OPTION
    public String sayHello2(String[] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
    }
}
