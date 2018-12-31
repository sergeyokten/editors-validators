package oktenweb.editorsvalidators.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
@Data
public class Contact {
    @Size(min = 3, message = "{foo.message}")
    private String name;
    List<Phone> phoneList = new ArrayList<>();

    public Contact(String name) {
        this.name = name;
    }
}
