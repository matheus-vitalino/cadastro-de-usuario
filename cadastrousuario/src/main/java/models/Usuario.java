
package models;

public class Usuario {
    private String nome;
    private String usuario;
    private String senha;
    private String permissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
    public Usuario(String nome, String usuario, String senha, String permissao)
    {
        if(nome.equals(""))
            throw new IllegalArgumentException("Nome não pode ser vazio");
        if(usuario.equals(""))
            throw new IllegalArgumentException("Usuario não pode ser vazio");
        if(senha.equals(""))
            throw new IllegalArgumentException("Senha não pode ser vazia");
        
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.permissao = permissao;
    }
}
