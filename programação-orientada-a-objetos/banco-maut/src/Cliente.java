public class Cliente {
  private String nome;
  private String CPF;
  private int dataNascimento;
  private String endereço;

  public Cliente(String nome,String CPF,int dataNascimento,String endereço)
  {
    this.nome=nome;
    this.CPF=CPF;
    this.dataNascimento=dataNascimento;
    this.endereço=endereço;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCPF() {
    return CPF;
  }
  public int getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(int dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public String getEndereço() {
    return endereço;
  }
  public void setEndereço(String endereço) {
    this.endereço = endereço;
  }

  
}
