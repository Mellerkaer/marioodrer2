package PizzaProgram;

import java.util.ArrayList;

public class ValuesOfPizza {
    public int nummer;
    public String navn;
    public String ingredienser;
    public int pris;
    public String valuta;
    public static ArrayList<ValuesOfPizza> menyPizza= new ArrayList<>();



    public ValuesOfPizza (int nummer, String navn, String ingredienser, int pris){

        this.nummer = nummer;
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;

        valuta ="kr";
        menyPizza.add(this);

    }

    public String pizzaToString (){
        return this.nummer +this.navn + ": " + this.ingredienser + " ............ " + this.pris + " " + valuta;
    }

    public static void visAllePizzaer(){
        for(ValuesOfPizza pizza : menyPizza){
            System.out.println(pizza.pizzaToString());
        }
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return "ValuesOfPizza{" +
                "nummer=" + nummer +
                ", navn='" + navn + '\'' +
                ", ingredienser='" + ingredienser + '\'' +
                ", pris=" + pris +
                ", valuta='" + valuta + '\'' +
                '}';
    }
}
