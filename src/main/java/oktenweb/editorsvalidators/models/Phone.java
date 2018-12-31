package oktenweb.editorsvalidators.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Phone {
    private String number;
    private Contact contact;

//    public Phone(String number) {
//        this.number = number;
//    }
//
//    public Phone(String number, Contact contact) {
//        this.number = number;
//        this.contact = contact;
//    }


}
