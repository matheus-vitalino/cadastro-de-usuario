/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Usuario;

/**
 *
 * @author 026002
 */
public class UsuarioDAO {
    public void cadastrar(Usuario usuario) throws SQLException
    {
        String sql = "INSERT INTO usuario (NOME, USUARIO, SENHA, PERMISSAO) VALUES (?, ?, ?, ?)";
        
        PreparedStatement ps;
        ps = Conexao.getConexao().prepareStatement(sql);
        
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getUsuario());
        ps.setString(3, usuario.getSenha());
        ps.setString(4, usuario.getPermissao());
        
        ps.execute();
        ps.close();
    }
    
    public List<Usuario> listar() throws SQLException
    {
        String sql = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();

        PreparedStatement ps;
        ps = Conexao.getConexao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()) {
            String nome = rs.getString("Nome");
            String usuario = rs.getString("Usuario");
            String senha = rs.getString("Senha");
            String permissao = rs.getString("Permissao");
            
            Usuario usuarioNovo = new Usuario(nome, usuario, senha, permissao);
            usuarios.add(usuarioNovo);
        }
        
        return usuarios;
    }
}
