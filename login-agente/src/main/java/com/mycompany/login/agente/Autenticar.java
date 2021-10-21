package com.mycompany.login.agente;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Autenticar {

    private String login;
    private String senha;

    public Autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    conectaBD config = new conectaBD();
    JdbcTemplate con = new JdbcTemplate(config.getBancoDeDados());

    public String validar() {
        List<Usuario> selectUser = con.query("SELECT * FROM agente_de_estacao WHERE"
                + " login_agente = ? AND senha_agente = ?", new BeanPropertyRowMapper(Usuario.class), login, senha);

        String loginUser = selectUser.get(0).getLogin_agente();
        String senhaUser = selectUser.get(0).getSenha_agente();

            if (selectUser.isEmpty()) {
                return "Login não encontrado";
            } else {
                return "Login realizado com sucesso";
            }
        }
    }
