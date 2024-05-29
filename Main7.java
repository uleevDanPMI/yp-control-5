import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

       
        double averageAge = persons.stream()
                .filter(p -> p.getType().equals("stationary"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
                // По умолчанию 0, если нет клиентов с стационарными телефонами

        System.out.println("Средний возраст клиентов с стационарными телефонами: " + averageAge);

        
        List<Person> persons2 = persons.stream()
                .filter(p -> p.getAge() >= 18)
                .filter(p -> p.getType().equals("mobile"))
                .collect(Collectors.toList());

        System.out.println("Список клиентов2:");
        for (Person person : persons2) {
            System.out.println(person);
        }

        
        boolean hasFemale60 = persons.stream()
                .filter(p -> p.getGender().equals("female"))
                .filter(p -> p.getAge() > 60)
                .anyMatch(p -> p.getType().equals("stationary"));

        System.out.println(hasFemale60);
  
        List<Person> phoneBook = persons.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(Comparator.comparingInt(Person::getAge)))
                .collect(Collectors.toList());

          
          // for( int i=0;i<persons2.size();i++)
           //System.out.println(persons2.get(i));
      }
 }
