/**
 * Created by Sujith on 5/9/2014.
 */
class GroovyClassVariables {
    String firstName
    String lastName
    String address
    int age

    String toString() {
        "Person Name:"+firstName+""+lastName+"\n"+"Address:"+address+"\n"+"Age:"+age
    }

    static void main(def args){
        GroovyClassVariables user=new GroovyClassVariables()
        user.setFirstName("Sujith")
        user.lastName="Gannamaneni"
        user.setAddress("75 peterborough St, Apt#407, Boston, MA 02215")
        user.age=24
        println(user.toString())
        GroovyClassVariables user2 =new GroovyClassVariables(firstName:"Srujan",lastName:"Gannamaneni",address:"Manipal", age:21)
        println(user2.toString())

        if(user.is(user2)){
            println("Same")
        }else{
            println("Different")
        }
    }
}
