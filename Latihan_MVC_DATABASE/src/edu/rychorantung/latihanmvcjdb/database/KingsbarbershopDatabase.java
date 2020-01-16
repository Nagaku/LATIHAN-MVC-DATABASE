/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rychorantung.latihanmvcjdb.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.rychorantung.latihanmvcjdb.impl.PelangganDaoImpl;
import edu.rychorantung.latihanmvcjdb.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author USER
 * NAMA: Rycho Rantung
 * KELAS: IF-1
 * NIM: 10118005
 */
public class KingsbarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection geConnection() throws SQLException{
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        
        
        return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(geConnection());
        }
        
        return pelangganDao;
    }
}
