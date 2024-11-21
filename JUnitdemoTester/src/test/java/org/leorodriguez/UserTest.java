package org.leorodriguez;

import org.leorodriguez.model.User;
import org.leorodriguez.model.UserDao;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;

public class UserTest {
    static User user1;
    static User user2;
    static User user3;
    static User user4;
    static User user5;
    static UserDao userDao;
    static List<User> users = new ArrayList<User>();

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        user1 = new User("ew@gmail","Ezra Williams","password","123 ABC Lane","GA","30294");
        user2 = new User("tony@stark.com" ,"Tony Stark", "IAmTheBest","Address1","NY", "22222");
        user3 = new User("hank@pym.com","Hank Pym","IAmTheBest","Address7", "CA", "22222");
        user4 = new User("mb@marked.com","Do No","bim","333 Manta St","GA","30000");
        user5 = new User(5,"bruce@bannertech.com","Bruce Banner", "HulkStrong","Address3","HI", "44444");
        users.add(user2);
        users.add(user3);
        userDao = new UserDao();
    }
    @Test
    public void testLogin(){
        //user assertEquals method to determine if the login will return true:
        assertTrue(userDao.login(user1.getEmail(), user1.getPassword()));
    }

    //Positive test:
    @Test
    public void testUserExists(){
        assertEquals(userDao.findByUserId(user5.getUserId()), user5);
    }
    //Negative test
    @Test
    public void testUserNotTheSame(){
        assertNotSame(userDao.findByUserId(user5.getUserId()), user5);
    }
    //Pos test
    @Test
    public void testFindUsersByZipCode(){
        assertEquals(users, userDao.findUsersByZipcode(user2.getZipcode()));
    }
}