public class HasComputers extends Feature {
    int howManyComputers;

    public HasComputers(int computers){
        howManyComputers = computers;
    }

    public boolean meet (Feature feature){
        return  sameClass(feature) && ( this.howManyComputers >= ((HasComputers)feature).howManyComputers);

    }
}
