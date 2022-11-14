package jam.workspace.studentmanagementsystem.service;

import jam.workspace.studentmanagementsystem.domain.User;
import jam.workspace.studentmanagementsystem.exception.EmailExistsException;
import jam.workspace.studentmanagementsystem.exception.EmailNotFoundException;
import jam.workspace.studentmanagementsystem.exception.UserNotFoundException;
import jam.workspace.studentmanagementsystem.exception.UsernameExistsException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {
    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistsException, EmailExistsException;
    List<User> getUsers();
    User findUserByUsername(String username);
    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNotLocked, boolean isEnabled, MultipartFile profileImage) throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException;
    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isNotLocked, boolean isEnabled, MultipartFile profileImage) throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException;
    void deleteUser(Long id);
    void resetPassword(String email) throws EmailNotFoundException;
    User updateProfileImage(String username, MultipartFile profileImage) throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException;
}
