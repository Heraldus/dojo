import java.util.List;

public class Solicitud {

    private List<Feature> requirements;

    public Solicitud( List<Feature> requirements){
        this.requirements = requirements;
    }

    public List<Feature> getRequirements(){
        return requirements;
    }
}
