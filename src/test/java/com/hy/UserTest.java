package com.hy;

import com.hy.entity.User;
import com.hy.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/***
 * <p>
 *
 * </p>
 * @author hy
 * @date 2021/2/19 14:51
 **/
@SpringBootTest
public class UserTest {

    @Resource
    private UserMapper userMapper;


    /***
     * 获取全部的客户信息
     */
    @Test
    void findAll(){
        List<User> userList = userMapper.selectList(null);
        if (CollectionUtils.isEmpty(userList)){
            return;
        }
        for (User user : userList) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getAge() + " " + user.getEmail());
        }
    }

    /***
     * 新增客户信息
     */
    @Test
    void save(){
        User user = User.builder()
                .name("伽罗")
                .age(18)
                .email("jialuo@qq.com")
                .build();
        userMapper.insert(user);
    }

    /***
     * 编辑客户
     */
    @Test
    void update(){
        User user = User.builder()
                .id(8L)
                .name("安琪拉")
                .build();
        userMapper.updateById(user);
    }

    /***
     * 乐观锁编辑。 注：乐观锁要先查询才起作用，直接new一个对象去编辑时会失效。
     */
    @Test
    void optimisticLock(){
        User user = userMapper.selectById(8L);
        user.setName("安琪拉");
        userMapper.updateById(user);
    }

}
