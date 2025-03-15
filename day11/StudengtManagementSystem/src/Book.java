import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book{
     String title;
     String author;
     boolean isBorrowed;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
}
