public class Gerente extends Funcionario{
    String nivelGerencial;

    public Gerente(){

    }
    public Gerente(String nome, int cpf, String cargo, Double salario, String nivelGerencial){
        super(nome,cpf, cargo, salario);
        this.nivelGerencial = nivelGerencial;
    }

    public String getNivelGerencial(){
        return nivelGerencial;
    }
    public void setNivelGerencial(String nivelGerencial){
        this.nivelGerencial = nivelGerencial;
    }

    @Override
    public void assinarContrato(){
        System.out.println("Assinou contrato como CNPJ");
    }

    @Override
    public void tirandoFerias(){
        System.out.println("[STATUS DE FÉRIAS]: ESTÁ DE FÉRIAS"); //n eh necessarimante implementado em todas subclasses
    }

    public String toString(){
       return "NIVEL GERENCIAL: " +
       nivelGerencial;
    }
}
