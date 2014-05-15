/**
 * Created by Sujith on 5/9/2014.
 */
class GroovyStrings {
    static void main(def args){
        def name="sujith";
        if(name.getClass().getName().is("java.lang.String")){
            println "Its a String";
        }
        def welcome="Hello $name";
        def welcome2 = 'Hello $name'
        println welcome
        println welcome2
        println welcome.getClass().getName();
        println welcome2.getClass().getName();
    }
}
