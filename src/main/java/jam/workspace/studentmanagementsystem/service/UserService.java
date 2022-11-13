package jam.workspace.studentmanagementsystem.service;

import jam.workspace.studentmanagementsystem.domain.User;
import jam.workspace.studentmanagementsystem.exception.EmailExistsException;
import jam.workspace.studentmanagementsystem.exception.UserNotFoundException;
import jam.workspace.studentmanagementsystem.exception.UsernameExistsException;

import java.util.List;

public interface UserService {
    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistsException, EmailExistsException;
    List<User> getUsers();
    User findUserByUsername(String username);
    User findUserByEmail(String email);
}
