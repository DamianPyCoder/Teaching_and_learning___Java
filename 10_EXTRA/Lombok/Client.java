import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Client {
    @NonNull
    private String id;
    @NonNull
    private String name;
    private String email;
    private String phoneNumber;
}





// import java.util.Objects;

// public class Client {
//     private String id;
//     private String name;
//     private String email;
//     private String phoneNumber;

//     public Client(String id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public Client(String id, String name, String email, String phoneNumber) {
//         this.id = id;
//         this.name = name;
//         this.email = email;
//         this.phoneNumber = phoneNumber;
//     }

//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getPhoneNumber() {
//         return phoneNumber;
//     }

//     public void setPhoneNumber(String phoneNumber) {
//         this.phoneNumber = phoneNumber;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Client client = (Client) o;
//         return Objects.equals(id, client.id) &&
//                 Objects.equals(name, client.name) &&
//                 Objects.equals(email, client.email) &&
//                 Objects.equals(phoneNumber, client.phoneNumber);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(id, name, email, phoneNumber);
//     }

//     @Override
//     public String toString() {
//         return "Client{" +
//                 "id='" + id + '\'' +
//                 ", name='" + name + '\'' +
//                 ", email='" + email + '\'' +
//                 ", phoneNumber='" + phoneNumber + '\'' +
//                 '}';
//     }
// }
// // 78 lineas sin lombok