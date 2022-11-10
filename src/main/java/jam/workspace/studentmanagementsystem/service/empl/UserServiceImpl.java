package jam.workspace.studentmanagementsystem.service.empl;

import jam.workspace.studentmanagementsystem.domain.User;
import jam.workspace.studentmanagementsystem.domain.UserPrincipal;
import jam.workspace.studentmanagementsystem.repository.UserRepository;
import jam.workspace.studentmanagementsystem.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
//@Qualifier("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =  userRepository.findUserByUsername(username);
        if (user == null) {
            log.error("User not found by username " + username);
            throw new UsernameNotFoundException("User not found by username " + username);
        }else {
            user.setLastLoginDateDisplay(user.getLastLoginDate());
            user.setLastLoginDate(new Date());
            userRepository.save(user);
            UserPrincipal userPrincipal = new UserPrincipal(user);
            log.info("Returning found user by username" + username);
            return userPrincipal;
        }
    }
}
