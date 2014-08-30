package com.mytravel.account.config;

import com.mytravel.account.domain.User;
import com.mytravel.account.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static junit.framework.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CoreConfig.class, DataSourceConfig.class, MyBatisConfig.class})
public class PersistenceDomainIntegrationTest {

    @Resource
    private UserService userService;

    @Test
    public void thatAllUsersReturned() {
        List<User> users = userService.getAll();
        assertTrue(users.size() > 0);
    }

}
