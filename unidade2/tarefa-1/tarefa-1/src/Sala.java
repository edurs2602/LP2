public class Sala {
    private String nome;
    private String cargo;
    private double salario;
    private Funcionario funcionario;

    public Sala(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = definirSalario(cargo);
    }

    private double definirSalario(String cargo) {
        double salario = 0;

        switch (cargo) {
            case "Recepcionista":
                salario = 1200;
                break;
            case "Administrador":
                salario = 2000;
                break;
            case "Cozinheiro":
                salario = 1500;
                break;
            case "Contador":
                salario = 1700;
                break;
            default:
                System.out.println("Cargo inválido");
        }

        return salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
