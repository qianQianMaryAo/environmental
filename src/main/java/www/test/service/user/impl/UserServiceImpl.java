package www.test.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.test.dao.UserDao;
import www.test.pojo.User;
import www.test.service.user.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectByNameAndPasswordService(String userCode, String userPassword) {

        User user = userDao.selectByNameAndPassword(userCode, userPassword);
        return user;
    }

    @Override
    public List<User> getUserListService(String userName, Integer userRole, Integer currentPageNo, Integer pageSize) {
        List<User> userList = userDao.getUserListDao(userName, userRole, currentPageNo, pageSize);
        return userList;
    }

    @Override
    public Integer getUserCountService(String userName, Integer userRole) {
        Integer userCount= userDao.getUserCountDao(userName, userRole);
        return userCount;
    }

    @Override
    public Integer addUserListService(User user) {
        return userDao.addUserListDao(user);
    }

    @Override
    public Integer insertUserListService(User user) {
        return userDao.insertUserListDao(user);
    }

    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public Integer deleteByIdService(Integer id) {
        return userDao.deleteById(id);
    }

    @Override
    public Integer modifyUserPasswordService(String userPassword,Integer id) {
        return userDao.modifyUserPasswordDao(userPassword,id);
    }

    @Override
    public List<User> selectAllService() {
        return userDao.selectAll();
    }
}
