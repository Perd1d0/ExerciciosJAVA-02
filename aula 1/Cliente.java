public class Cliente {
  private String nome;
  private String email;
  private String telefone;

  public Cliente(String nome, String email, String telefone) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + ", E-mail: " + this.email + ", Telefone: " + this.telefone;
  }
}