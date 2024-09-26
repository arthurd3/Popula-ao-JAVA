public class Populacao { 
    private char sexo;
    private double altura;
    private EnumCabelo cabelocor; 
    private EnumOlho olhoscor;
    private int idade;
    private String nome;

    public Populacao() { 
    }
    
    //Construtor
    public Populacao(char sexo, double altura, EnumOlho olhoscor, EnumCabelo cabelocor, int idade , String nome) { 
        this.sexo = sexo;
        this.altura = altura;
        this.olhoscor = olhoscor;
        this.cabelocor = cabelocor;
        this.idade = idade;
        
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public EnumOlho getOlhos(){
        return olhoscor;
    }
    public void setOlhos(EnumOlho olhoscor){
        this.olhoscor = olhoscor;
    }
    
    public EnumCabelo getCabelo(){
        return cabelocor;
    }
    public void setCabelo(EnumCabelo cabelocor){
        this.cabelocor = cabelocor;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
    public void Informacoes(){
        System.out.println("Informaçoes : " + getNome());
        System.out.println("Sexo :" + getSexo());
        System.out.println("Altura :" + getAltura());
        System.out.println("Olho :" + getOlhos());
        System.out.println("Cabelo :" + getCabelo());
        System.out.println("Idade :" + getIdade());
        System.out.println("\n");
    }
    
}
