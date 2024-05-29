import java.util.ArrayList;
import java.util.List;
 public class Data { 
     private static List<Person> persons = new ArrayList();
     static {
         Person person1 = new Person("Иван", "Иванов", male, 33,7880917 );
         Person person2 = new Person()
         
         persons.add(person1);
         persons.add(person2);
         
     }
     public static List<Person> getPersons(){
     return persons;
 }
 }