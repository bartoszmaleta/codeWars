package kyu8;

public class God {
    public static Human[] create() {
    Man man = new Man();    
    Woman woman = new Woman();    
    Human[] human = {new Man(), new Woman()};
    return human;
    }
}

class Man extends Human {

}

class Woman extends Human {

}

class Human {

}