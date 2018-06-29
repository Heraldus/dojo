import java.util.List;

public class Cau {

    public Aula getSuitableRoom(List<Aula> aulas, Solicitud solicitud){
       return aulas.stream().filter(au -> au.meetRequirement(solicitud)).findFirst().orElse(new NoAula());
    }


}
