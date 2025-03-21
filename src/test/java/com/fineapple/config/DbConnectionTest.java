package com.fineapple.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DbConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDatabaseConnection() throws Exception {

        try (Connection connection = dataSource.getConnection()) {
            assertNotNull(connection, "성공");
        }
    }
}
