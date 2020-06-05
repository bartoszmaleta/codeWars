package javaExe.kyu8;

import java.util.Random;
import java.util.ArrayList;

public class Ghost {
    private Random rand = new Random();

    public Ghost() {
    }

    public static void main(String[] args) {
    }

    public String getColor() {
        String yellowColour = "yellow";
        String whiteColour = "white";
        String redColour = "red";
        String purpleColour = "purple";
        ArrayList<String> colours = new ArrayList<>();
        colours.add(whiteColour);
        colours.add(redColour);
        colours.add(yellowColour);
        colours.add(purpleColour);

        // for (int i = 0; i < 1; i++) {
        // System.out.println(colours.get(rand.nextInt(colours.size())));
        // String randomColour = colours.get(rand.nextInt(colours.size()));
        // return randomColour;

        String randomColour = colours.get(rand.nextInt(colours.size()));
        System.out.println(randomColour);
        return randomColour;
    }
}