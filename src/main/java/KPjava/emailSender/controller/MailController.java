package KPjava.emailSender.controller;

import KPjava.emailSender.entity.Email;
import KPjava.emailSender.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sender.SendMail;

import javax.mail.MessagingException;



@Controller
@RequestMapping("/")
public class MailController {

    @Autowired
    IEmailRepository emailRepository;

    @GetMapping
    public String getMail(Model model) throws MessagingException {
        SendMail sendMail= new SendMail();
        Email email =new Email();


        model.addAttribute("email",email);
        return "mailForm";
    }

    @PostMapping(path = "/send")
    public String saveNewItem(Email email) throws MessagingException {
//        emailRepository.save(email);
        SendMail sendMail= new SendMail();
        sendMail.send(email.getTo(),email.getSubject(),email.getContent());
        return "redirect:/";
    }

}
