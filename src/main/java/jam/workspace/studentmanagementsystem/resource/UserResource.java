package jam.workspace.studentmanagementsystem.resource;

import jam.workspace.studentmanagementsystem.domain.ExceptionHandling;
import jam.workspace.studentmanagementsystem.exception.EmailExistsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ={"/api/v1/users/", "/"})
public class UserResource extends ExceptionHandling {

    @GetMapping
    public String showUser() throws EmailExistsException {
        throw new EmailExistsException("email already exists");
    }
    @PostMapping("message")
    public String showMessage() {
        return "Here is the message";
    }
}
