package br.edu.utfpr.dv.sireata.dao.strategy;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Stefanie
 */
public abstract class CrudDAO {
    protected CreateDAO criarDAO;
    protected ReadDAO lerDAO;
    protected UpdateDAO atualizarDAO;
    protected DeleteDAO excluirDAO;

    public int criar(Object object) throws SQLException{
        return criarDAO.salvar(object);
    }

    public Object buscarId(int id) throws SQLException{
        return lerDAO.buscarId(id);
    }

    public List<Object> listarAta(int id) throws SQLException{
        return (List<Object>) lerDAO.listarAta(id);
    }

    public void atualizar(int id, Object objeto) throws SQLException{
        atualizarDAO.atualizar(id, objeto);
    }

    public void excluir(int id) throws SQLException{
        excluirDAO.excluir(id);
    }
    
}
