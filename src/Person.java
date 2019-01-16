public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String writePersonToFile(Person person) {
        System.out.println(person.getName());
        String FileName = person.getName();
        if (FileName == null || FileName.isEmpty()) {
            person.setName("empty-person");

        }
        FileName = person.getName() + ".txt";
        writePerson(person,FileName);
        return FileName;
    }

    public static void writePerson(Person person, String FileName) {

    }


}
