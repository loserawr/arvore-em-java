import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Arvore {

    static private String caminhoArquivoProd = "C:\\temp\\Clientes2.txt";
    public static void main(String[] args) {
        // Criando uma árvore ordenada (TreeSet) de objetos do tipo Regpro
        Regpro reg = new Regpro(null, null, null);
        TreeSet<Regpro> arvoreRegpro = new TreeSet<>((o1, o2) -> {
            // Personalizando a comparação para ordenar por ordem alfabetica
            return o1.getIdentif().compareTo(o2.getIdentif());
            }
        );
                try {
                    File ArquivoProd = new File(caminhoArquivoProd); // objeto criado referenciando o txt
                    Scanner entrada = new Scanner(ArquivoProd);

            while (entrada.hasNextLine()) {
                reg.setLinha(entrada.nextLine());
                String[] col = reg.getLinha().split(";"); 
                reg.setIdentif(col[0]);
                reg.setNome(col[1]);
                reg.setPais(col[2]);

                // Alimentando a arvore
                arvoreRegpro.add(new Regpro(reg.getIdentif(), reg.getNome(), reg.getPais()));
            }
            entrada.close();

        // Exibindo detalhes dos produtos na árvore (ordenados por código)
        System.out.println("Detalhes dos produtos na árvore (ordenados por ordem alfabetica):");
        for (Regpro produto : arvoreRegpro) {
            System.out.println("Identificação: " + produto.getIdentif()+"\n" +
                               "Nome: " + produto.getNome()+"\n" +
                               "Pais: " + produto.getPais()+"\n");
        }
         } catch (FileNotFoundException e) {
            System.out.println("ArquivoProd não encontrado: " + caminhoArquivoProd);
        }
    }
}
