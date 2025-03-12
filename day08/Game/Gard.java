package Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gard {
    private String size;
    private String color;
    int count;

    @Override
    public String toString() {
        return size+color;
    }
}
