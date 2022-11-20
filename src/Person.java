public class Person {
    private String name;

    public Person(String name){
        System.out.println("New person created");
        setName(name);
    }

    public Person(){

    }
    public String getName(){
//TODO: return the person's name
        return  name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);

    }
     public static void main(String[] args){
        var alpha = new Person();
        alpha.name ="Brittney";
         alpha.sayHello();

         var person1 = new Person("John");
         var person2 = new Person("John");
         System.out.println(person1.getName().equals(person2.getName()));
         System.out.println(person1 == person2);
          person1 = new Person("John");
          person2 = person1;
         System.out.println(person1 == person2);
     }
}
