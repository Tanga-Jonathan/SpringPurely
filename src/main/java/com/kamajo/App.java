package com.kamajo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        //Alien alien = new Alien();
        //create a resource folder in the main then an xml file
        Alien alien = context.getBean(Alien.class);
        alien.code();
    }
}
