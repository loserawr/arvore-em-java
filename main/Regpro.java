public class Regpro {
    private String Identif, Nome, Pais, Linha;
    static private String caminhoArquivo = "C:\\temp\\Clientes2.txt";

    public Regpro(String Identif, String Nome, String Pais){
        this.Identif = Identif;
        this.Nome = Nome;
        this.Pais = Pais;

    }

    public static String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public static void setCaminhoArquivo(String caminhoArquivo) {
        Regpro.caminhoArquivo = caminhoArquivo;
    }

    public String getLinha() {
        return Linha;
    }

    public void setLinha(String Linha) {
        this.Linha = Linha;
    }

    public String getIdentif() {
        return Identif;
    }

    public void setIdentif(String Identif) {
        this.Identif = Identif;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
}
