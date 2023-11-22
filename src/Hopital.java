import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.putIfAbsent(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).ajouterPatient(p);
        } else {
            ListPatients newListPastients = new ListPatients();
            newListPastients.ajouterPatient(p);
            medecinPatients.put(m, newListPastients);
        }
    }

    /*Avec l&#39api stream */
    public void afficherMap() {
        medecinPatients.entrySet().stream().forEach(mp -> {
            System.out.println("Le Medecin est : " + mp.getKey());
            System.out.println("Les patient sont : \n");
            System.out.println(mp.getValue());

        });
    }

        /* Afficher les patients d’un medecin dont le nom est &quot;mohamed&quot; */
        public void afficherMedcinPatients (Medecin medecin){
            medecinPatients.get(medecin).getListP().stream()
                    .filter(patient -> patient.getNom().equals("mohamed"))
                    .forEach(System.out::println);}
    }

