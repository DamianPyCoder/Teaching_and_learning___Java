import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Book {
    @NonNull
    private String isbn;
    @NonNull
    private String title;
    private String author;
    private int year;
}


// import java.util.Objects;

// public class Book {
//     private String isbn;
//     private String title;
//     private String author;
//     private int year;

//     public Book(String isbn, String title) {
//         this.isbn = isbn;
//         this.title = title;
//     }

//     public Book(String isbn, String title, String author, int year) {
//         this.isbn = isbn;
//         this.title = title;
//         this.author = author;
//         this.year = year;
//     }

//     public String getIsbn() {
//         return isbn;
//     }

//     public void setIsbn(String isbn) {
//         this.isbn = isbn;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public int getYear() {
//         return year;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Book book = (Book) o;
//         return year == book.year &&
//                 Objects.equals(isbn, book.isbn) &&
//                 Objects.equals(title, book.title) &&
//                 Objects.equals(author, book.author);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(isbn, title, author, year);
//     }

//     @Override
//     public String toString() {
//         return "Book{" +
//                 "isbn='" + isbn + '\'' +
//                 ", title='" + title + '\'' +
//                 ", author='" + author + '\'' +
//                 ", year=" + year +
//                 '}';
//     }
// }
// // 78 lineas sin lombok