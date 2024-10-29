package PizzaProgram;

import java.util.Scanner;

import static PizzaProgram.ValuesOfPizza.menyPizza;

public class Pizza {



    public Pizza (){


    }
        ValuesOfPizza margaritha = new ValuesOfPizza(1, "Margaritha", "Tomatsovs og ost", 65);
        ValuesOfPizza hawaii = new ValuesOfPizza(2,"Hawaii", "Tomatsovs, ost, skinke og ananas", 70);
        ValuesOfPizza pepperoni = new ValuesOfPizza(3,"Pepperoni", "Tomatsovs, ost og pepperoni", 75);
        ValuesOfPizza meatlover = new ValuesOfPizza(4,"Meatlover", "Tomatsovs, ost, oksekød og pepperoni", 80);
        ValuesOfPizza bello = new ValuesOfPizza(5,"Bello", "Tomatsovs, ost, svampe og champingoner", 70);
        ValuesOfPizza mamma = new ValuesOfPizza(6,"Mamma", "Tomatsovs, ost og friske tomater", 90);
        ValuesOfPizza smello = new ValuesOfPizza(7, "Smello", "Tomatsovs, ost, feta og gorgonzolla", 30);




    public void kommandoer(){
        boolean kmOn = true;
        while(kmOn) {
            menyMuligheder();
            System.out.println("Skriv et tal fra 1-8 ud fra den kommando du vil udføre.");
            Scanner sc = new Scanner(System.in);
            int scInput = sc.nextInt();
            if (scInput == 1) {
                ValuesOfPizza.visAllePizzaer();

            } else if (scInput == 2) {

            } else if (scInput == 3) {

            } else if (scInput == 4) {

            } else if (scInput == 5) {

            } else if (scInput == 6) {

            } else if (scInput == 7) {

            } else if (scInput == 8){
                kmOn = false;
            }else {
                System.out.println("Jeg forstod ikke hvad du ville, prøve at indtaste et nyt nummer mellem 1-8.");
            }
        }
    }
    public void menyMuligheder(){
        System.out.println( "" +
                "\n1. Vis liste over pizza" +
                "\n2. Opret ny order" +
                "\n3. Se nuværende ordrer" +
                "\n4. Rediger ordre" +
                "\n5. Beregn pris for ordre" +
                "\n7. Adminastrativt arbejde" +
                "\n7A.Se dagens omsætning" +
                "\n7B.Se dagens tab" +
                "\n7C.Ændre menyKortet" +
                "\n8. Sluk for programmet");
    }
}
