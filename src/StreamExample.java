import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//1.отсортировать
//2.избавиться от пустых строк и нул
//3.привести к верхнему регистру
//4.создать юзеров
//5.вывести и

public class StreamExample {
    private static void doWithoutLambda() {
        List<String> stringS = new ArrayList<>();
        stringS.add("Ivan");
        stringS.add("");
        stringS.add(null);
        stringS.add("stormnet");
        stringS.add("test");
        stringS.add("stepan");
        Iterator<String> iterator = stringS.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name == null || name.isEmpty()) {
                iterator.remove();
            }
        }
        Collections.sort(stringS);
        List<User> users = new ArrayList<>();
        for (String name : stringS) {
            User user = new User(name.toUpperCase());
            users.add(user);
        }
    }

    static class User {
        String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }






    
    private static void doWithLambda(List<String> strings) {
        List<User> users = strings.stream().filter(name -> name != null && !name.isEmpty()).
                sorted().map(String::toUpperCase).map(User::new).collect(Collectors.toList());
        users.forEach(System.out::println);

    }
}
