
public class Main
{
   
    public static void main(String[] args)
    {
        Populacao pessoa1 = new Populacao();
        
        pessoa1.setNome("Jose");
        pessoa1.setOlhos(EnumOlho.VERDE);
        pessoa1.setSexo('f');
        pessoa1.setAltura(1.42);
        pessoa1.setCabelo(EnumCabelo.castanho);
        pessoa1.setIdade(19);
        
        pessoa1.Informacoes();
        
        
        Populacao pessoa2 = new Populacao();
        
        pessoa2.setNome("Claudio");
        pessoa2.setOlhos(EnumOlho.AZUL);
        pessoa2.setSexo('m');
        pessoa2.setAltura(1.72);
        pessoa2.setCabelo(EnumCabelo.preto);
        pessoa2.setIdade(22);
        
        pessoa2.Informacoes();
        
        
        Populacao pessoa3 = new Populacao();
        
        pessoa3.setNome("Arthur");
        pessoa3.setOlhos(EnumOlho.VERDE);
        pessoa3.setSexo('m');
        pessoa3.setAltura(1.92);
        pessoa3.setCabelo(EnumCabelo.louro);
        pessoa3.setIdade(27);
        
        pessoa3.Informacoes();
        
        Comparador comparador = new Comparador();

        comparador.Comparacao(pessoa1, pessoa2, pessoa3);
        comparador.MediaAlturaF(pessoa1 , pessoa2 , pessoa3);
        comparador.MediaAlturaM(pessoa1 , pessoa2 , pessoa3);
        
    }


}
