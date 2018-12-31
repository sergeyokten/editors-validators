package oktenweb.editorsvalidators.controllers;

import oktenweb.editorsvalidators.editors.PhoneEditor;
import oktenweb.editorsvalidators.models.Contact;
import oktenweb.editorsvalidators.models.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("contact", new Contact("vaysas"));
        return "home";
    }

    @PostMapping("/save")
    public String save(@Valid Contact contact, BindingResult bindingResult, Map<String, String> xxx) {
//        System.out.println("form------" + form);
        if (bindingResult.hasErrors()) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
            return "home";
        }
        System.out.println(contact);
        return "redirect:/";
    }

    @Autowired
    private PhoneEditor phoneEditor;

    @InitBinder()
    public void initBinder(WebDataBinder webDataBinder) {
        System.out.println("react 1");
        webDataBinder.registerCustomEditor(Phone.class, phoneEditor);
        System.out.println("react 2");
    }
}
