package Chapter_14;

class Gen12<T extends Number>{
    T ob;
    T[] vals;

    public Gen12(T ob, T[] vals) {
        this.ob = ob;
        this.vals = vals;
    }
}
public class GenArrays {

    Integer[] n = {1, 2, 3, 4, 5};
    Gen12<?> gens[] = new Gen12<?>[10];
}
