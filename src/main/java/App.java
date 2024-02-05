import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Ivanov", "Ivan", 20);

        Gson gson = new Gson();
        String gsonString = gson.toJson(person);
        System.out.println("Converting Person object to JSON string:\n" + gsonString);

        Person deserializationPerson = gson.fromJson(gsonString, Person.class);
        System.out.println("\nConverting JSON string to Person object:\n"
                + deserializationPerson.toString());
    }
}
