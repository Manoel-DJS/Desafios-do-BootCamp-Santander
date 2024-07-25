package dio.challenge.me;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ARrumar dps

        Curso curso1 = new Curso();
        curso1.setTitulo("PAndox boxis");
        curso1.setDescricao("Curso para Pandorar");
        curso1.setCargaHoraria(100);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentor3");
        mentoria.setDescricao("é um mentor");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Conteudo curso10 = new Curso();

        curso10.setTitulo("anderesk");
        curso10.setDescricao("A vida é bela");

        System.out.println(curso10);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("CIencias");
        bootcamp1.setDecricao("ciencias da escola");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso10);
        bootcamp1.getConteudos().add(mentoria);

        Dev devPrego = new Dev();
        devPrego.setNome("Tenente Pregão");
        devPrego.inscreverBootcamp(bootcamp1);

        Dev devRato = new Dev();
        devRato.setNome("Tenente Rato");

        System.out.println("Conteudos inscritos: " + devPrego.getConteudosInscritos());
    }
}