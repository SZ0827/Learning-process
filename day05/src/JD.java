import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD implements Status {
    private String name;
    private boolean status;

    @Override
    public void swich() {
        status=!status;
    }
}
