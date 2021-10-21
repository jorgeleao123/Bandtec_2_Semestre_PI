/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.commons.dbcp2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
/**
 *
 * @author jotal
 */
public class FuncionariosRowMapper {
    
    DataSource totemhubDataSource = new DataSource();
    JdbcTemplate configDB = new JdbcTemplate(totemhubDataSource.getTotemHubDataSource());

    public List<Funcionarios> userQuery(String login, String senha){
        List<Funcionarios> userQuery = configDB.query("SELECT * FROM agente_de_estacao WHERE login_agente = ? AND senha_agente = ?;",
                new BeanPropertyRowMapper<>(Funcionarios.class), login, senha);
        return userQuery;
    }

    public Funcionarios mapRow(ResultSet rs, int rowNum) throws SQLException{
        Funcionarios funcionario = new Funcionarios();
        funcionario.setLogin(rs.getString("login_agente"));
        funcionario.setSenha(rs.getString("senha_agente"));
        return funcionario;
    }
    
    
    
}
