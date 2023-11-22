import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecin {
    private Set<Medecin> setM;
    public SetMedecin(){
        setM = new HashSet<>();
    }
    public void ajouterMedecin(Medecin m) {
        if(!setM.contains(m)){
            setM.add(m);
        }
    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach(System.out::println);
    }
    public long nombreMedecins(){
        return setM.stream().count();
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
        return  setM.stream().collect(Collectors.toCollection(()->new TreeSet<>()));
    }
}
