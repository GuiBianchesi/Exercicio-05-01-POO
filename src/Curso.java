public class Curso {
    
    String nome;
    int quantidadealunos;
    String turma;
    float mensalidade;

public Curso(){
}

public Curso(String n, int q, String t, float m){
nome = n;
quantidadealunos = q;
turma = t;
mensalidade = m;
}

void cadastraCurso(){
    System.out.println("Curso cadastrado!");
}

void imprimeDados(){
    System.out.println("Curso: "+ nome);
    System.out.println("Quantidade de alunos: "+ quantidadealunos);
    System.out.println("Turma: "+ turma);
    System.out.println("Valor da mensalidade: "+ mensalidade);
}

float calculaTotalMensalidade(){
    return quantidadealunos * mensalidade;
}

}

