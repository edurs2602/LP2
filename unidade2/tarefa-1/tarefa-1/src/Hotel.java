import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private double saldoEmCaixa;
    private int quantidadeQuartos;
    private int quantidadeFuncionarios;
    private int quantidadeClientes;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<Quarto> quartos;
    private List<Sala> salas;

    public Hotel(String nome) {
        this.nome = nome;
        this.saldoEmCaixa = 0;
        this.quantidadeQuartos = 0;
        this.quantidadeFuncionarios = 0;
        this.quantidadeClientes = 0;
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public void atualizarSaldo(double valor) {
        this.saldoEmCaixa += valor;
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        quantidadeClientes++;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        quantidadeFuncionarios++;
    }

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
        quantidadeQuartos++;
    }

    public void cadastrarSala(Sala sala, Funcionario funcionario) {
        sala.setFuncionario(funcionario);
        salas.add(sala);
    }

    public void demitirFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
        quantidadeFuncionarios--;
    }

    public void darBaixaCliente(Cliente cliente) {
        clientes.remove(cliente);
        quantidadeClientes--;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Hotel: " + nome);
        System.out.println("Saldo em Caixa: R$" + saldoEmCaixa);
        System.out.println("Quantidade de Quartos: " + quantidadeQuartos);
        System.out.println("Quantidade de Funcionários: " + quantidadeFuncionarios);
        System.out.println("Quantidade de Clientes: " + quantidadeClientes);
    }
}