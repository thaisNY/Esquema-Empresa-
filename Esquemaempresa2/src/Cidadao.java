public abstract class Cidadao {
    //Atributos
    private String nome;
    private int cpf; //nunca se modifica
    //construtores
    public Cidadao(){

    }
    public Cidadao(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    //Gets e sets
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCpf(){
        return cpf;
    }

    //Metodos
    public abstract void assinarContrato();//Necessariamente td subclasse implementa

    public void tirandoFerias(){
        System.out.println("[STATUS DE FÉRIAS]"); //n eh necessarimante implementado em todas subclasses
    }

    public String toString(){
        return "Nome: " +
                nome +
                "CPF: " +
                cpf;
    }
}
