import java.util.ArrayList;
import java.util.Collections;
//******************************************************************** //
// Devoir4.java     Auteur: Gansonre Ismael && jeremie cyrille
// // 
//******************************************************************

enum Couleur { ROUGE, JAUNE, VERT };
//classe Voiture 
 public class Voiture implements Comparable <Voiture> {
    String Marque;
    int Annnee = 0;
    Couleur color;
    int compteur = 0;
//Contructuteur avec parametres
    public Voiture(String Marque, int Annnee, String color) {
        this.Marque = Marque;
        this.Annnee = Annnee;
        this.color = Couleur.valueOf(color);
        compteur++;
    }
    public  Voiture() //Contructuteur sans parametres
    {
        Voiture.Marque = "";
        Voiture.Annnee = 0;
        //Voiture.color=valueOf(Couleur);
        compteur++;
    }// l’interface Comparable
    public int compareTo(Voiture vt) {
        if (Annnee == vt.Annnee)
            return 0;
        else if (Annnee > vt.Annnee)
            return 1;
        else
            return -1;
    }
    public String toString() {
        return "Voiture{" + "entry= " + compteur + "Marque= " + Marque + '\'' + ", Annnee= " + Annnee + '}';
    }
}

 }
 
    public static int main(String[] args) {

        ArrayList<Voiture> test = new ArrayList<Voiture>();
        test.add(new Voiture("bmw", 2000, "vert"));
        test.remove(Voiture("bmw", 2000, "vert"));

        Collections.sort(test);
        for (Voiture vt : test) {
            System.out.println(vt.Marque + " " + vt.Annnee + " " + vt.color);
        }
    }
