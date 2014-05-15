/**
 * Created by Sujith on 5/15/2014.
 */
class GroovyFindIntersection {

    int[] findIntesection(){
        def a = [1,3,5,7,9,11]
        def b = [5,4,7,2,2,3,1]

        return a.intersect(b)
    }
    static void main(def args){
     GroovyFindIntersection f= new GroovyFindIntersection()
        for(int i : f.findIntesection()){
            println i
        }
    }
}
