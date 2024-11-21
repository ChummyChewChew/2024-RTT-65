package org.leorodriguez;
import org.hibernate.annotations.Parameter;
import org.junit.jupiter.api.BeforeAll;
import org.leorodriguez.model.User;
import org.leorodriguez.model.UserDao;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;


public class ParameterizedTestEx {
    private static UserDao userDao =null;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        userDao = new UserDao();
    }
    @ParameterizedTest
    @CsvSource({
            "ew@gmail,Ezra Williams,password,123 ABC Lane,GA,30294",
            "tony@stark.com,Tony Stark,IAmTheBest,Address1,NY,22222",
            "mb@marked.com","Do No","bim","333 Manta St","GA","30000"
    })
    void testGetUsrById(ArgumentsAccessor arguments) throws ArgumentAccessException,
            SQLException {
        System.out.println(this.toString());
        User expectedUser = new User(arguments.getString(0),
                arguments.getString(1),
                arguments.getString(2),
                arguments.getString(3),
                arguments.getString(4),
                arguments.getString(5));
        User actualUser = userDao.findByEmail(arguments.getString(0));
        assertEquals(expectedUser, actualUser);
    }

}