import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();
        Futbolista f1 = new Futbolista(1, "Casillas", new Demarcaciones("Portero"), "Real Madrid");
        Futbolista f2 = new Futbolista(15, "Ramos", new Demarcaciones("Lateral derecho", "Medio centro"), "Real Madrid");
        Futbolista f3 = new Futbolista(3, "Pique", new Demarcaciones("Central"), "FC Barcelona");
        Futbolista f4 = new Futbolista(5, "Puyol", new Demarcaciones("Central"), "FC Barcelona");
        Futbolista f5 = new Futbolista(11, "Capdevila", new Demarcaciones("Lateral izquierdo"), "Villareal");
        Futbolista f6 = new Futbolista(14, "Xabi Alonso", new Demarcaciones("Defensa mediocampo", "Mediocampo"), "Real Madrid");
        Futbolista f7 = new Futbolista(16, "Busquets", new Demarcaciones("Defensa mediocampo"), "FC Barcelona");
        Futbolista f8 = new Futbolista(8, "Xavi Hernandez", new Demarcaciones("Mediocampo"), "FC Barcelona");
        Futbolista f9 = new Futbolista(18, "Pedrito", new Demarcaciones("Extremo izquierdo", "Falso extremo"), "FC Barcelona");
        Futbolista f10 = new Futbolista(6, "Iniesta", new Demarcaciones("Extremo derecho", "Mediocampo"), "FC Barcelona");
        Futbolista f11 = new Futbolista(7, "Villa", new Demarcaciones("Delantero centro"), "FC Barcelona");

        futbolistas.add(f1);
        futbolistas.add(f2);
        futbolistas.add(f3);
        futbolistas.add(f4);
        futbolistas.add(f5);
        futbolistas.add(f6);
        futbolistas.add(f7);
        futbolistas.add(f8);
        futbolistas.add(f9);
        futbolistas.add(f10);
        futbolistas.add(f11);

        Gson gson = new Gson();

        System.out.println(gson.toJson(futbolistas));

    }
}
