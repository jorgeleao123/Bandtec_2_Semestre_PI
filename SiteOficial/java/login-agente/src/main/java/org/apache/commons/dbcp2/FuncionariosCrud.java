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
            Funcionarios.setId(rs.getInt("id_pais"));
            Funcionarios.setNome(rs.getString("nome_pais"));
            Funcionarios.setExtensao(rs.getDouble("extensao_km2_pais"));
            return funcionarios;
        }
    }
        
}
