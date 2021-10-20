/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.commons.dbcp2;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.dao.EmptyResultDataAccessException;
    
/**
 *
 * @author jotal
 */
public class FuncionariosCrud {

    private JdbcTemplate jdbcTemplate;

    private FuncionariosCrud() {
        
        BasicDataSource dataSource = new BasicDataSource();
//      configuração do dataSource, como visto antes
        jdbcTemplate = new JdbcTemplate((DataSource) dataSource);
    }
    
    public List listarTodos(){
        List<Map<String, Object>> lista = jdbcTemplate.queryForList("select * from funcionarios");
        return lista;
    }
    
        List<Funcionarios> lista = jdbcTemplate.query("select * from funcionarios",
                                        new BeanPropertyRowMapper(Funcionarios.class));
    
    public class FuncionariosRowMapper implements RowMapper<Funcionarios>{
        
        @Override
        public Funcionarios mapRow(ResultSet rs, int rowNum) throws SQLException {
            Funcionarios funcionarios = new Funcionarios();
            
            return funcionarios;
        }
    }
    
    public Map<String, Object> recuperar(int id) {
        try {
            Map<String, Object> registro = jdbcTemplate.queryForMap(
                    "select * from tbl_pais where id_pais = ?", id);
            return registro;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
}
        
}
