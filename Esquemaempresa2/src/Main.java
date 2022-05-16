public class Main {
    public static void main(String[] args){
        Cidadao a1 = new Funcionario("Vinicius", 10291092,"Coodenador", 5000.00);
        System.out.println(a1.getNome() +" "+ a1.getCpf() + " "  + a1);
        Cidadao a2 = new Gerente("Bartolomeu", 1231231312, "Gerente de vendas", 10000.00,"Nivel 2");
        System.out.println(a2.getNome() +" " + a2.getCpf() + " " + a2);
        Cidadao a3 = new Presidente("Flavio Augusto", 123123, 100000.00);
        System.out.println(a3.getNome() +" " + a3.getCpf() + " " + a3);
    }
}