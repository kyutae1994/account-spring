package account.accountspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("account")
    public String account(Model model) {
        model.addAttribute("data", "hello!!");
        return "account";
    }
}
