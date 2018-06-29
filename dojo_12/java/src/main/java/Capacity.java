public class Capacity extends Feature {

    int internalCapacity;
    public Capacity(int capacity){
        internalCapacity = capacity;
    }

    public boolean meet (Feature feature){
            return  sameClass(feature) && ( this.internalCapacity >= ((Capacity)feature).internalCapacity);
    }

}
