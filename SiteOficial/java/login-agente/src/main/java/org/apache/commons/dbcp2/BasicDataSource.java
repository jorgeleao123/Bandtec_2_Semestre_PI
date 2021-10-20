/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.commons.dbcp2;

/**
 *
 * @author jotal
 */
public class BasicDataSource {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    // exemplo para MySql: "com.mysql.cj.jdbc.Driver"
        dataSource.setUrl("jdbc:sqlserver://totem-hub.database.windows.net:1433;database=totem-hub;encryp\n" +
                            "t=true;trustServerCertificate=false;hostNameInCertificate=*.totem-hub.database.windows.net;");
    // exemplo para MySql: "jdbc:mysql://localhost:3306/meubanco"
        dataSource.setUsername("meulogin");
        dataSource.setPassword("minhasenha");
    }

    private void setDriverClassName(String commicrosoftsqlserverjdbcSQLServerDriver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUrl(String jdbcsqlservermeubancodatabasewindowsnetme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setUsername(String meulogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPassword(String minhasenha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
