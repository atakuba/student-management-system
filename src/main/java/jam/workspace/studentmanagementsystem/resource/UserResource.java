package jam.workspace.studentmanagementsystem.resource;

import jam.workspace.studentmanagementsystem.domain.ExceptionHandling;
import jam.workspace.studentmanagementsystem.domain.User;
import jam.workspace.studentmanagementsystem.exception.EmailExistsException;
import jam.workspace.studentmanagementsystem.exception.UserNotFoundException;
import jam.workspace.studentmanagementsystem.exception.UsernameExistsException;
import jam.workspace.studentmanagementsystem.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ={"/api/v1/users/", "/"})
@AllArgsConstructor
public class UserResource extends ExceptionHandling {

    private final UserService userService;

    @GetMapping("get")
    public String showUser() throws EmailExistsException {
        throw new EmailExistsException("email already exists");
    }
    @PostMapping("message")
    public String showMessage() {
        return "Here is the message";
    }

    @PostMapping("register")
    public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, UsernameExistsException, EmailExistsException {
        return new ResponseEntity<>(userService.register(user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail()), HttpStatus.OK);
    }
}
