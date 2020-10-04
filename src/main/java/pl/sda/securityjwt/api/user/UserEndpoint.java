package pl.sda.securityjwt.api.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.securityjwt.domain.user.User;
import pl.sda.securityjwt.domain.user.UserService;

@RestController
@RequiredArgsConstructor
public class UserEndpoint {

    private final UserService userService;

    @PostMapping
    @RequestMapping("/user")
    public void registerUser(@RequestBody User user) {
        userService.registerUser(user);
    }

}
