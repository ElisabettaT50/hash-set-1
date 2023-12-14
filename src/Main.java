import java.util.HashSet;

/*
Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<>();
        food.add("pane");
        food.add("cereali");
        food.add("spezie");
        food.add("latte");
        for(String elemento : food){
            System.out.println(elemento);
        }
        System.out.println("la mia lista contiene " + food.size() + " elementi");
    }
}