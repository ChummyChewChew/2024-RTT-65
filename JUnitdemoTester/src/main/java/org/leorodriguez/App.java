package org.leorodriguez;

import org.leorodriguez.model.User;
import org.leorodriguez.model.UserDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User("ew@gmail", "Ezra Williams", "password", "123 ABC Lane", "GA", "30294");
        User user2 = new User("anthonyisawesome@email.com", "Anthony Hopp", "ezrawontguessmypassword", "1500 White House Lane",
                "TX", "12345");
        User user3 = new User("tony@stark.com", "Tony Stark", "IAmTheBest", "Address1", "NY", "22222");
        User user4 = new User("peter@stark.com", "Peter Parker", "MJ4eva", "Address2", "NY", "33333");
        User user5 = new User("bruce@bannertech.com", "Bruce Banner", "HulkStrong", "Address3", "HI", "44444");
        User user6 = new User("steve@aol.com", "Steve Rogers", "ShieldBad", "Address4", "NY", "55555");
        User user7 = new User("clint@circus.com", "Clint Barton", "MissingTheWidow", "Address5", "MA", "66666");
        User user8 = new User("nat@shield.com", "Natalia Romanoff", "NotTooLate", "Address6", "FL", "77777");
        User user9 = new User("scott@stark.com", "Scott Lang", "IAmTheBest", "Address7", "NY", "88888");
        User user10 = new User("hank@pym.com", "Hank Pym", "IAmTheBest", "Address7", "CA", "22222");

        UserDao ud = new UserDao();
       /* ud.saveUser(user1);
        ud.saveUser(user2);
        ud.saveUser(user3);
        ud.saveUser(user4);
        ud.saveUser(user5);
        ud.saveUser(user6);
        ud.saveUser(user7);
        ud.saveUser(user8);
        ud.saveUser(user9);
        ud.saveUser(user10);*/

        boolean loginTrue = ud.login(user1.getEmail(), user1.getPassword());
        User userTest = ud.findByEmail(user2.getEmail());
        List<User> users = new ArrayList<User>();
        users = ud.findUsersByZipcode(user3.getZipcode());
        System.out.println(loginTrue);
        System.out.println(userTest);
        for (User user : users) {
            System.out.println(user);
        }


    }
}
