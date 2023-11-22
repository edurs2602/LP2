public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel ABC");

        // Cadastrando quartos
        Quarto quarto1 = new Quarto(1, 2, "Simples");
        Quarto quarto2 = new Quarto(2, 2, "Casal");
        Quarto quarto3 = new Quarto(3, 3, "Luxuoso");
        hotel.cadastrarQuarto(quarto1);
        hotel.cadastrarQuarto(quarto2);
        hotel.cadastrarQuarto(quarto3);

        // Cadastrando funcionários
        Funcionario funcionario1Recepcionista = new Funcionario("Maria", "12345678901", "Recepcionista");
        Funcionario funcionario2Administrador = new Funcionario("Carlos", "98765432101", "Administrador");
        hotel.cadastrarFuncionario(funcionario1Recepcionista);
        hotel.cadastrarFuncionario(funcionario2Administrador);

        // Cadastrando salas
        Sala salaRecepcao = new Sala("Recepção", "Recepcionista");
        Sala salaAdministracao = new Sala("Administração", "Administrador");
        hotel.cadastrarSala(salaRecepcao, funcionario1Recepcionista);
        hotel.cadastrarSala(salaAdministracao, funcionario2Administrador);

        // Cadastrando clientes
        Cliente cliente1 = new Cliente("João", "11122233344");
        Cliente cliente2 = new Cliente("Ana", "55566677788");
        Cliente cliente3 = new Cliente("Maria", "12345678910");
        hotel.cadastrarCliente(cliente1);
        hotel.cadastrarCliente(cliente2);

        // Testando operações
        double valorEstadia = cliente1.alugarQuarto(quarto1, 3);
        System.out.println("Valor Estadia Cliente 1: R$" + valorEstadia);

        cliente2.alugarQuarto(quarto2, 2);

        funcionario1Recepcionista.darAumento();
        funcionario2Administrador.demitir(hotel);

        cliente1.darBaixa(hotel);
        // cliente2.darBaixa(hotel);

        // Exibindo informações do hotel após as operações
        hotel.exibirInformacoes();

    }
}