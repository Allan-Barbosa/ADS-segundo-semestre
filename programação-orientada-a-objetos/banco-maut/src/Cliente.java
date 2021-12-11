import java.time.LocalDate;

public class Cliente {
  private String nome;
  private String CPF;
  private LocalDate dataNascimento;
  private Endereço endereço;

  public Cliente(String nome,String CPF,LocalDate dataNascimento,Endereço endereço)
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
  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public Endereço getEndereço() {
    return endereço;
  }
  public void setEndereço(Endereço endereço) {
    this.endereço = endereço;
  }

  
}
