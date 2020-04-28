import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        //He cambiado de un objeto tipo Demarcaciones a un arraylist de demarcaciones al ver que usted lo tenía puesto así.
        ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();
        Futbolista f1 = new Futbolista(1, "Casillas", new ArrayList<>(Arrays.asList("Portero")) , "Real Madrid");
        Futbolista f2 = new Futbolista(15, "Ramos", new ArrayList<>(Arrays.asList("Lateral derecho", "Medio centro")), "Real Madrid");
        Futbolista f3 = new Futbolista(3, "Pique", new ArrayList<>(Arrays.asList("Central")), "FC Barcelona");
        Futbolista f4 = new Futbolista(5, "Puyol", new ArrayList<>(Arrays.asList("Central")), "FC Barcelona");
        Futbolista f5 = new Futbolista(11, "Capdevila",new ArrayList<>(Arrays.asList("Lateral izquierdo")), "Villareal");
        Futbolista f6 = new Futbolista(14, "Xabi Alonso", new ArrayList<>(Arrays.asList("Defensa mediocampo")), "Real Madrid");
        Futbolista f7 = new Futbolista(16, "Busquets",new ArrayList<>(Arrays.asList("Defensa Mediocampo")), "FC Barcelona");
        Futbolista f8 = new Futbolista(8, "Xavi Hernandez",new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")), "FC Barcelona");
        Futbolista f9 = new Futbolista(18, "Pedrito", new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")), "FC Barcelona");
        Futbolista f10 = new Futbolista(6, "Iniesta",new ArrayList<>(Arrays.asList("Extremo derecho", "Mediocampo")) , "FC Barcelona");
        Futbolista f11 = new Futbolista(7, "Villa",new ArrayList<>(Arrays.asList("Delantero centro")), "FC Barcelona");

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

        String jsonString;

        System.out.println(jsonString = gson.toJson(futbolistas));

        Type typelist =new TypeToken<ArrayList<Futbolista>>(){}.getType();

        ArrayList<Futbolista> arrayfutbolista = gson.fromJson(jsonString,typelist);
        ArrayList<String> ramos = new ArrayList<>();

        Iterator it = arrayfutbolista.iterator();

        while (it.hasNext()){
            Futbolista jugador = (Futbolista) it.next();
            if (jugador.getNombre().equals("Ramos")){
                Iterator it2 = jugador.getDemarcaciones().iterator();
                while (it2.hasNext()){
                    ramos.add((String) it2.next());
                }
            }

        }
        System.out.println("Demarcaciones posibles de ramos: "+ramos);
    }
}
