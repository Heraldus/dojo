public class M2 extends Feature{
    int m2 ;
    public M2(int m2){
        this.m2 = m2;
    }

    public boolean meet (Feature feature){
            return  sameClass(feature) && ( this.m2 >= ((M2)feature).m2);
    }
}
