public class Presidente extends Cidadao{
    private Double prolabore;
    public Presidente(){

    }
    public Presidente(String nome, int cpf, Double prolabore){
        super(nome, cpf);
        this.prolabore = prolabore;
    }

    public Double getProlabore(){
        return prolabore;
    }
    public void setProlabore(){
        this.prolabore = prolabore;
    }
    public void assinarContrato(){
        System.out.println("Contrato para criar a empresa");
    }

    public String toString(){
        return "PROLABORE:" +
                prolabore;
    }
}
