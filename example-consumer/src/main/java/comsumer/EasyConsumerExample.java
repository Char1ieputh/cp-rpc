package comsumer;

import com.model.User;
import com.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args){
        //TODO 需要获取UserService的实现类对象
        UserService userService = null;
        User user = new User();
        user.setName("long");
        User newUser = userService.getUser(user);
        if (newUser!= null){
            System.out.println(newUser.getName());
        }else {
            System.out.println("user == null");
        }

    }
}
