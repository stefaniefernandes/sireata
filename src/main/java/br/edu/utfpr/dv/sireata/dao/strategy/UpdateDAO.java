/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao.strategy;

import java.sql.SQLException;

/**
 *
 * @author Stefanie
 */
public interface UpdateDAO {
    public void atualizar(int id, Object objeto) throws SQLException;
}
