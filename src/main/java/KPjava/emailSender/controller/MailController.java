package KPjava.emailSender.controller;

import KPjava.emailSender.service.MailContentBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;

@Controller
@RequestMapping("/mailForm")
public class MailController {

    @GetMapping
    public String getMail(Model model){
        MailContentBuilder mailContentBuilder= new MailContentBuilder(new TemplateEngine());
   mailContentBuilder.build("elo");
        return "mailForm";
    }

}
