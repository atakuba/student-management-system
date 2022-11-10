package jam.workspace.studentmanagementsystem.repository;

import jam.workspace.studentmanagementsystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
    User findUserByEmail(String email);

}
