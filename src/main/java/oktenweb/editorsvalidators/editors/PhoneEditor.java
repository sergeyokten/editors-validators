package oktenweb.editorsvalidators.editors;

import oktenweb.editorsvalidators.models.Phone;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class PhoneEditor extends PropertyEditorSupport {


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Phone phone = new Phone();
        phone.setNumber(text);
        setValue(phone);
    }
}
