/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;
import models.Usuario;

/**
 *
 * @author 026002
 */
public class UsuarioController {
    private UsuarioDAO dao = new UsuarioDAO();
    
    public boolean cadastrarUsuario(Usuario usuario)
    {
        try
        {
            dao.cadastrar(usuario);
            System.out.println("Cadastro Realizado Com Sucesso!");
            return true;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public List<Usuario> buscarAlunos()
    {
        try
        {
            return dao.listar();
        }
         catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
