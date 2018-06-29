import java.util.List;

public class Feature {

    public boolean meet(Feature requirement){
        return false;
    }

    public boolean meet(List<Feature> requirements){
        return requirements.stream().anyMatch(r -> this.meet(r));
    }

    protected boolean sameClass(Feature feature){
        return   (this.getClass() == feature.getClass());
    }

}
