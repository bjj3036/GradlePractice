package kr.hs.dgsw.gradletutorial;

import kr.hs.dgsw.gradletutorial.Greeting;

public class HelloWorld{
    public static void main(String[] args){
        Greeting greeting = new Greeting("Junjae");
        System.out.println(greeting.getComment());
    }
}