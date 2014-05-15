/**
 * Created by Sujith on 5/9/2014.
 */
class GroovyLists {
    static void main(args){
        List<GroovyUser> users = new ArrayList<GroovyUser>();
        GroovyUser user1=new GroovyUser('Sujith','Gannamaneni',24,'75 Peterborough St');
        GroovyUser user2=new GroovyUser('Srujan','Gannamaneni',21,'Manipal');
        users[0]=user2
        users.add(1,user1)
        println users.get(1).firstName;
        println users.get(0).lastName;

    }
}
