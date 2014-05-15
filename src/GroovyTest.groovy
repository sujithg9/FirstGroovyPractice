/**
 * Created by Sujith on 5/9/2014.
 */
class GroovyTest {
    static sum(a,b){
        a+b;
    }
    static void main(def args){
        def myList=["sujith","G",24,6075426682]
        myList.each{println it}
        println 'the sum of two number 5 and 8 is:'+sum(5,8);
        println 'the sum of two number 5 and 7 is:'+sum(5,7);
    }
}
