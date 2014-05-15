/**
 * Created by Sujith on 5/9/2014.
 */
class GroovyVariables {
    static void main(def args){
        int i=3;
        int j=5;
        int k=i+j;
        int l=i.plus(3);
        assert(l==6);
        println i.getClass().getName();
        println j.getClass().getName();
        println k.getClass().getName();
        println l.getClass().getName();

        def value=2.0F;
        println value.getClass().getName();
        def value2 = 1;
        println value2.getClass().getName();
        value2 = value2 / 2;
        println value2
        println value2.getClass().getName();

    }
}
