public class Main {
    public static void main(String[] args) {

        // PERSONA EJEMPLO
        // Person person = new Person();
        // person.setName("Damian M");
        // person.setAge(25);
        // System.out.println("Name: " + person.getName());
        // System.out.println("Age: " + person.getAge());



        // LIBRARY EJEMPLO
        Client client1 = new Client("C1", "Facundo Muela", "FM00@gmail.com", "123123123");
        Client client2 = new Client("C2", "Álvaro Ramos", "Alv@gmail.com", "123123123");

        Book book1 = new Book("111222333", "Aprendiendo Java con el mejor", "Damian Devops", 2024);
        Book book2 = new Book("444555666", "Python desde 0 a experto", "Damian M", 2023);

        Library library = new Library("BCN Library", "Calle Panot, 87");
        library.getClients().add(client1);
        library.getClients().add(client2);
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        System.out.println(library);

        System.out.println("Client 1: " + client1.getName());
        System.out.println("Book 1: " + book1.getTitle());
        client1.setEmail("newemail@example.com");
        System.out.println("Updated Client 1 Email: " + client1.getEmail());

        System.out.println("");
        System.out.println("Client 2: " + client2.getName());
        System.out.println("Book 2: " + book2.getTitle());
        client1.setEmail("newemail@example.com");
        System.out.println("Updated Client 2 Email: " + client1.getEmail());
    }
}
        
