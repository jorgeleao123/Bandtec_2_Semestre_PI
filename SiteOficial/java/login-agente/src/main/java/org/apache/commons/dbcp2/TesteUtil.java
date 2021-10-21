/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.commons.dbcp2;
import org.apache.commons.dbcp2.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author jotal
 */
public class TesteUtil {
    public static void main(String[] args) {
        DataSource totemhubDataSource = new DataSource();
        
        FuncionariosRowMapper funcionarios = new FuncionariosRowMapper();
    
        JdbcTemplate configDB = new JdbcTemplate(totemhubDataSource.getTotemHubDataSource());
        
        System.out.println(configDB.getDataSource());
       
        
    }
    
    
}
