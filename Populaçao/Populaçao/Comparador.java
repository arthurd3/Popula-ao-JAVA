
public class Comparador
{
    public void Comparacao(Populacao pessoa1 , Populacao pessoa2 , Populacao pessoa3){
        if(pessoa1.getAltura() > pessoa2.getAltura() && pessoa1.getAltura() > pessoa3.getAltura() ){
            System.out.println(pessoa1.getNome() + "E a Pessoa mais alta com a altura de : " + pessoa1.getAltura());
        }else if(pessoa2.getAltura() > pessoa1.getAltura() && pessoa2.getAltura() > pessoa3.getAltura() ){
            System.out.println(pessoa2.getNome() + "E a Pessoa mais alta com a altura de : " + pessoa2.getAltura());
        }else if(pessoa3.getAltura() > pessoa1.getAltura() && pessoa3.getAltura() > pessoa2.getAltura() ){
            System.out.println(pessoa3.getNome() + "E a Pessoa mais alta com a altura de : " + pessoa3.getAltura());
        }
    }
    
    public void MediaAlturaF(Populacao pessoa1, Populacao pessoa2, Populacao pessoa3) {
        double somaAltura = 0;
        int quantidadeMulheres = 0;

  
        if (pessoa1.getSexo() == 'F' || pessoa1.getSexo() == 'f') {
            somaAltura += pessoa1.getAltura();
            quantidadeMulheres++;
        }

 
        if (pessoa2.getSexo() == 'F' || pessoa2.getSexo() == 'f') {
            somaAltura += pessoa2.getAltura();
            quantidadeMulheres++;
        }

  
        if (pessoa3.getSexo() == 'F' || pessoa3.getSexo() == 'f') {
            somaAltura += pessoa3.getAltura();
            quantidadeMulheres++;
        }

        System.out.println("Quantidade de Mulheres é: " + quantidadeMulheres);
        if (quantidadeMulheres > 0) {
            double mediaAltura = somaAltura / quantidadeMulheres;
            System.out.println("A média de altura das mulheres é: " + mediaAltura);
        } else {
            System.out.println("Nenhuma mulher foi encontrada.");
        }
    }
    
    public void MediaAlturaM(Populacao pessoa1, Populacao pessoa2, Populacao pessoa3) {
        double somaAltura = 0;
        int quantidadeHomens = 0;

  
        if (pessoa1.getSexo() == 'M' || pessoa1.getSexo() == 'm') {
            somaAltura += pessoa1.getAltura();
            quantidadeHomens++;
        }

 
        if (pessoa2.getSexo() == 'M' || pessoa2.getSexo() == 'm') {
            somaAltura += pessoa2.getAltura();
            quantidadeHomens++;
        }

  
        if (pessoa3.getSexo() == 'M' || pessoa3.getSexo() == 'm') {
            somaAltura += pessoa3.getAltura();
            quantidadeHomens++;
        }
    
        
        if (quantidadeHomens > 0) {
            System.out.println("Quantidade de Homens é: " + quantidadeHomens);
            double mediaAltura = somaAltura /quantidadeHomens;;
            System.out.println("A média de altura dos Homens é: " + mediaAltura);
        } else {
            System.out.println("Nenhuma Homem foi encontrado.");
        }
    }
}
