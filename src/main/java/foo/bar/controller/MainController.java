package foo.bar.controller;

import foo.bar.model.User;
import foo.bar.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    private UserService userService;

    @RequestMapping( value = "/")
    public String index(Model model){
        return "index";
    }

    @RequestMapping(value = "catalog", method = RequestMethod.GET)
    public String catalog(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("listUser", this.userService.listUser());
        return "catalog";
    }
}
