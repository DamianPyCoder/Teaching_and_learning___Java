import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Library {
    private final String name;
    private final String address;
    private List<Client> clients = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
}






// import java.util.ArrayList;
// import java.util.List;
// import java.util.Objects;

// public class Library {
//     private String name;
//     private String address;
//     private List<Client> clients = new ArrayList<>();
//     private List<Book> books = new ArrayList<>();

//     public Library(String name) {
//         this.name = name;
//     }

//     public Library(String name, String address) {
//         this.name = name;
//         this.address = address;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }

//     public List<Client> getClients() {
//         return clients;
//     }

//     public void setClients(List<Client> clients) {
//         this.clients = clients;
//     }

//     public List<Book> getBooks() {
//         return books;
//     }

//     public void setBooks(List<Book> books) {
//         this.books = books;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Library library = (Library) o;
//         return Objects.equals(name, library.name) &&
//                 Objects.equals(address, library.address) &&
//                 Objects.equals(clients, library.clients) &&
//                 Objects.equals(books, library.books);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(name, address, clients, books);
//     }

//     @Override
//     public String toString() {
//         return "Library{" +
//                 "name='" + name + '\'' +
//                 ", address='" + address + '\'' +
//                 ", clients=" + clients +
//                 ", books=" + books +
//                 '}';
//     }
// }
// // 78 lineas sin lombok