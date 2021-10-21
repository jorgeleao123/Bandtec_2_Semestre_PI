/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.commons.dbcp2;

import org.apache.commons.dbcp2.BasicDataSource;
/**
 *
 * @author jotal
 */
public class DataSource {
    
    private BasicDataSource totemhubDataSource;

    public DataSource() {
        this.totemhubDataSource = new BasicDataSource();

        totemhubDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        totemhubDataSource.setUrl("jdbc:mysql://localhost:3306/totemhubDataSource");
        totemhubDataSource.setUsername("root");
        totemhubDataSource.setPassword("jotalion02");
    }

    public BasicDataSource getTotemHubDataSource() {
        return totemhubDataSource;
    }
    
}
