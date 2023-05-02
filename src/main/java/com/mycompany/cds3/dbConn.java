/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cds3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abdulmac
 */
public class dbConn {

    Connection conn;

//    create a class - env and add variables
//    final static String url = "db url";
//    final static String username = "db user";
//    final static String password = "db pass";
    public Connection connect() {

        try {
            conn = DriverManager.getConnection(env.url, env.username, env.password);
        } catch (SQLException exception) {
            throw new Error(exception);
        }

        return conn;

    }

}
