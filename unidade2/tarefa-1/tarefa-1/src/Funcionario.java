public class Funcionario {
    private static int proximoId = 1;

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private Sala sala;
    private int id;

    public Funcionario(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = definirSalario(cargo);
        this.id = proximoId++;
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

    public void darAumento() {
        this.salario *= 1.1;
    }

    public void demitir(Hotel hotel) {
        hotel.atualizarSaldo(-salario);

        if (sala != null) {
            sala.setFuncionario(null);
        }

        hotel.demitirFuncionario(this);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }
}
