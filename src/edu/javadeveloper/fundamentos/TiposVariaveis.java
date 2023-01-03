package edu.javadeveloper.fundamentos;

public class TiposVariaveis {
  public static void main(String[] args) {
    final char SEXO = 'M'; //variaveis imutaveis posuem a palavra chave 'final' e são escritas em maiusculo
    boolean simNao = true; //boolean pode ser true ou false
    byte idade = 26;
    short anoNascimento = 1996;
    int cep = 62755000; // se comecar com zero talvez precise mudar pra String
    long cpf = 12345678900l; // se comecar com zero talvez precise mudar pra String
    float telefone = 85999999999f;
    double salarioMinimo = 1320;

    short um = 1;
    int dois = 2 * um;
    short tres = (short) (dois + 1);

  }
}
