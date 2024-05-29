public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
    private int Id;
    private int age;
    

    
    public Person (String firstName,String lastName,String gender, int age, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone= phone;
        this.gender = gender;
        this.age = age;
        this.id= id;
     
    }
    
    public String getFirstName() {return firstName; }
    public void  setfirstName(String firstName) {this.firstName = firstName;}
    
    public String getlastName () { return lastName;}
    public void  setlastName(String lastName) {this.lastName = lastName;}
    
    public String getGender () { return gender;}
    public void setGender(String gender) {this.Gender = gender;}
    
    public int getId() {return id;}
     public void setid (int Id) {this.Id = id;}
    
    
    public int getAge() {return age;}
    
    public void setAge (int age) {this.age = age;}
    
    
    
    @Override 
    public String toString(){
        return "Person{  " +
        "firstName = ' " + firstName +  
        ",lastName = ' " + lastName + 
        " age = ' " + age + "id is" + id +"gender is " + "gender"+
    
        '}';
       
    }
    @Override 
    public int compareTo(Person o){
       return firstName.compareTo(o.getFirstName());// по имени
       
    
    }
    @Override
    public int CompareToage(person a)
    return age.compareTo(a.getAge()); // по возрасту
    
    
}