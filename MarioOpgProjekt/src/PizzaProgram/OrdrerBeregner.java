package PizzaProgram;

import java.util.List;

public class OrdrerBeregner {

        private ValuesOfPizza pizza;
        private int antal;

        public void OrdreBeregner(ValuesOfPizza pizza, int antal) {
            this.pizza = pizza;
            this.antal = antal;
        }

        // Beregn total pris for en liste af pizzaer
        public static double beregnTotalPris(List<ValuesOfPizza> pizzaer) {
            double totalPris = 0;

            for (ValuesOfPizza pizza : pizzaer) {
                totalPris += pizza.getPris() * getAntal();
            }

            return totalPris;
        }

        // Beregn dagens omsætning
        public static double beregnDagensOmsætning(List<List<ValuesOfPizza>> alleOrdrer) {
            double dagensOmsætning = 0;

            for (List<ValuesOfPizza> ordrer : alleOrdrer) {
                dagensOmsætning += beregnTotalPris(ordrer);
            }

            return dagensOmsætning;
        }

        // Tilføj en metode for at få antal af en bestemt pizza i ordren
        public int getAntal() {
            return antal;
        }

}

