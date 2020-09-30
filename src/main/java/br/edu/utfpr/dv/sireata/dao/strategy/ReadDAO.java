/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao.strategy;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Stefanie
 */
public interface ReadDAO {
    public Object buscarId(int id) throws SQLException;
    public List<Object> listarAta(int id) throws SQLException;
    
}
