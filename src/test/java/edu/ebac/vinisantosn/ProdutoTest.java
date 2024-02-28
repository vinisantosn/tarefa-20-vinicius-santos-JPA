package edu.ebac.vinisantosn;

import edu.ebac.vinisantosn.dao.IProdutoDAO;
import edu.ebac.vinisantosn.dao.ProdutoDAO;
import edu.ebac.vinisantosn.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;
    public ProdutoTest (){
        produtoDAO = new ProdutoDAO();
    }
    @Test
    public void cadastrarProduto(){
        Produto produto = new Produto();

        produto.setCodigo("PD01");
        produto.setNome("ARROZ");
        produto.setDescricao("ALIMENTO NA PRATELEIRA L1");
        produto.setPreco(342.76);
        produto = produtoDAO.cadastrar(produto);
        assertNotNull(produto);
        assertNotNull(produto.getId());

    }
}
