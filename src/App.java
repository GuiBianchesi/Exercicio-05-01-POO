import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System .in);
        
        Curso curso1 = new Curso();
        System.out.println("Nome do curso: ");
        curso1.nome = in.nextLine();
        System.out.println("Quantidade de aluno: ");
        curso1.quantidadealunos = in.nextInt();
        in.nextLine();
        System.out.println("Turma: ");
        curso1.turma = in.nextLine();
        System.out.println("Valor da mensalidade: ");
        curso1.mensalidade = in.nextFloat();
        in.nextLine();

        curso1.cadastraCurso();

        curso1.imprimeDados();
        System.out.println("Valor total: R$ "+ curso1.calculaTotalMensalidade());

        
        System.out.println("Nome do curso: ");
        String nome = in.nextLine();
        System.out.println("Quantidade de aluno: ");
        int quantidadealunos = in.nextInt();
        in.nextLine();
        System.out.println("Turma: ");
        String turma = in.nextLine();
        System.out.println("Valor da mensalidade: ");
        float mensalidade = in.nextFloat();
        Curso curso2 = new Curso(nome, quantidadealunos, turma, mensalidade);

        curso2.cadastraCurso();

        curso2.imprimeDados();
        System.out.println("Valor total: R$ "+ curso2.calculaTotalMensalidade());
        in.close();
    }

}
