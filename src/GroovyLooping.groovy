/**
 * Created by Sujith on 5/9/2014.
 */
class GroovyLooping {
    public static void main(def args){
        def list = ["Lars", "Ben", "Jack"]
        list.each{name->
            println name
        }
        list.each{
            println it
        }
        5.times {
            println "Times + $it "
        }
        1.upto(3) {
            println "Up + $it "
        }
        4.downto(1) {
            println "Down + $it "
        }
        def sum = 0
        1.upto(50) {
            sum += 1
        }
        println "sum is:"+sum
        (1..6).each
                {
                    println "Range $it"
                }
    }
}
