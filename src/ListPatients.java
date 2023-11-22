import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;
    public ListPatients(){ listP =  new ArrayList<>();}
    public List<Patient> getListP() {
        return listP;
    }
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }
    public void supprimerPatient(Patient p) {
        listP.remove(p);
}
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        return listP.stream().anyMatch(patient -> patient.equals(p));
    }


    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }
    /* Avec l’api Stream */
    public void afficherPatients() {
        listP.forEach(System.out::println);
    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted(Comparator.comparing(Patient::getNom))
                .collect(Collectors.toList());    }
    /* Avec l&#39;api stream */
    public void PatientSansRedondance(){
        listP.stream().distinct().forEach(System.out::println);
        /*à completer : Afficher la liste des patients sans redondance*/
    }
}
