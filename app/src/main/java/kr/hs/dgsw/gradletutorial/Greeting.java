package kr.hs.dgsw.gradletutorial;

public class Greeting{
    private String person;

    public Greeting(String person){
        this.person = person;
    }

    public String getComment(){
        return "Hello! " + person;
    }
}