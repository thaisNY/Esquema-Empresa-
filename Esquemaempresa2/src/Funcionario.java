public class Funcionario extends Cidadao{
    private String cargo;
    private Double salario;

    public Funcionario(){

    }
    public Funcionario(String nome, int cpf, String cargo, Double salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    @Override //Subescrevendo
    public void assinarContrato(){
        System.out.println("Assinado contrato CLT");
    }

    @Override
    public void tirandoFerias(){
        System.out.println("[STATUS DE FERIAS]: NAO ESTA DE FERIAS"); //n eh necessarimante implementado em todas subclasses
    }

    public String toString(){
        return "Cargo: " +
                cargo +
                " " +
                "Salario: " +
                salario;
    }
}
