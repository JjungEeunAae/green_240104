package com.ea.restapi03.users;

import com.ea.restapi03.exception.ErrorCode;
import com.ea.restapi03.exception.LogExcetion;
import com.ea.restapi03.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User regist(User user) {
        User emailCheck = userRepository.findByEmail(user.getEmail());

        // 중복 이메일이 있을 경우 오류 메세지를 띄운다.
        if(emailCheck != null) {
            //System.err.println(user.getEmail() + " 중복 이메일이 있습니다.");
            throw new LogExcetion(ErrorCode.DUPLICATE);
        }

        User dbUser = userRepository.save(user);
        return dbUser;
    }

    public List<User> getAllUsers() {
        List<User> list = userRepository.findAll();
        return list;
    }

    // 특정 id 조회
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()) {
            throw new UserException(ErrorCode.NOTFOUND);
        } else {
            return user.get();
        }
    }

    public User modifyUser(User user) {
        User emailUser = userRepository.findByEmail(user.getEmail());

        if (emailUser == null) {
            throw new UserException(ErrorCode.NOTUPDATE);
        }

        emailUser.setWdate(user.getWdate());
        emailUser.setUsername(user.getUsername());
        emailUser.setPassword(user.getPassword());
        emailUser.setGender(user.getGender());

        User dbUser = userRepository.save(emailUser);

        return dbUser;
    }

    public void delete(Long id) {
        Optional<User> dbUser = userRepository.findById(id);

        // 삭제할 아이디가 없으면 오류 메세지 전달
        if(dbUser.isEmpty()) {
            throw new UserException(ErrorCode.NOTFOUND);
        }

        // 둘 중에 하나 써도 됨

        // id에 대한 삭제를 진행
        //userRepository.deleteById(id);

        // 객체 자체를 넘겨서 삭제를 진행
        userRepository.delete(dbUser.get());
    }

    public void delete() {
        userRepository.deleteAll();
    }
}
