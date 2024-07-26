package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getAllUsers();
}
