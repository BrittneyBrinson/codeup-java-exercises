import java.util.Random;
public class ServerGenerator {

   public String[] adjectives ={"average", "awful", "bewildered", "average","bubbly", "brainy", "balm", "busy","breakable", "charming" };

    public String[] noun = {"hamburger", "planet", "animal", "piano", "apple", "parrot", "pencil", "hydrogen", "raincoat", "beach" };


    public String mixMatch(){
        System.out.println("Here is your server name: ");
       return noun[new Random().nextInt(noun.length)] + "-" + adjectives[new Random().nextInt(adjectives.length)];
    }

    public static void main(String[] arguments){
        var person1 = new ServerGenerator();

        System.out.println(person1.mixMatch());
    }



}
