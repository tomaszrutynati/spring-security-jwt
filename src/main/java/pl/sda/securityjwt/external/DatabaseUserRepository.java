package pl.sda.securityjwt.external;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.securityjwt.domain.user.User;
import pl.sda.securityjwt.domain.user.UserRepository;

@Component
@RequiredArgsConstructor
public class DatabaseUserRepository implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    @Override
    public void createUser(User user) {
        UserEntity userEntity = UserEntity.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
        jpaUserRepository.save(userEntity);
    }
}
