package com.example;

import java.util.Random;

public class JokeLib {


    String[] myjokes = {"Chuck Booms: Back in Cleveland\n" +
            "\n" +
            "It's cool to be back in Cleveland. I lived in L.A. for eight years. I can't tell you how cool it " +
            "is to be able to go to the bank and make a deposit without body armor on.\n",
            "Classic Booty Call... Cops\n" + "The cops must be after you because it's "
                    +"illegal to look that good.\n",
            "Bathtime for Criminals\n" + "Q: Why'd the robber take a bath?\n" +
                    "\n" +
                    "A: He wanted to make a clean getaway. ",
            "Allen Edge: Burglars\n" +
                    "\n" +
                    "They've broken in my house so many times, they leave notes complaining about things: 'The salt was low." +
                    "' 'Pick up bread. We be back.' Grease all over my stove -- they cooked and left the best chicken and dressing " +
                    "you ever want to lay your lips on.\n"
    };

    public String jokeA(){
        Random num = new Random();
        int randjoke = num.nextInt((4 - 3) + 1) + 1;
        return myjokes[randjoke];
    }
}
