
package br.ulbra.entity;


public class Usuario {
  private int pkIdUso;
  private String nomeUsu;
  private String emailUsu;
  private String senhaUsu;
         
 
    public Usuario (){
    this.pkIdUso = 1;
    this.nomeUsu = "admin";
    this.emailUsu = "adm@adm.com";
    this.senhaUsu = "123";
    
}

    public int getPkIdUsu() {
        return pkIdUso;
    }

    public void setPkIdUsu(int pkIdUsu) {
        this. pkIdUso = pkIdUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

   
    
    
    
    
}
