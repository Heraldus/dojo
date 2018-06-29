import java.util.List;

public class Aula {
    private Label name;
    private List<Feature> features;

   protected Aula() {

    }

    public Aula(List<Feature> features,Label name ) {
        this.features = features;
        this.name = name;
    }

    public String printLabel(){
       return name.print();
    }

    public boolean meetRequirement(Solicitud solicitud){
        return  solicitud.getRequirements().stream().allMatch(x -> this.supoort(x));
    }

    private boolean supoort(Feature x) {
       return this.features.stream().anyMatch(f -> f.meet(x));
    }

}

class NoAula extends Aula {

    public boolean meetRequirement(Solicitud solicitud){
        return false;
    }

    public String printLabel(){
        return new Label("No hay aula disponible").print();
    }
}