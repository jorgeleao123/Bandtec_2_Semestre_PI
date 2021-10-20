/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.commons.dbcp2;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author jotal
 */
public class Funcionarios {
    
    private Integer id;
    private String nome;
    private Double extensao;
// getters e setters


    // getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getExtensao() {
        return extensao;
    }

    public void setExtensao(Double extensao) {
        this.extensao = extensao;
    }
    
}
