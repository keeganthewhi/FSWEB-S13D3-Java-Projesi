


public class Main {



    public static void main(String[] args) {
        com.workintech.model.Person person = new com.workintech.model.Person("John", "Doe", 20);
        com.workintech.model.Person person1 = new com.workintech.model.Person("mehmet","metintas",32,true,new String[]{"ing","tr"},"Atasehir");

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("---------------------------------------------");
        com.workintech.model.Wall wall = new com.workintech.model.Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());


    }
}








