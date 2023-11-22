public class Cliente {
    private static int proximoId = 1;

    private String nome;
    private String cpf;
    private int quartosAlugados;
    private int diasHospedado;
    private double desconto;
    private int id;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.quartosAlugados = 0;
        this.diasHospedado = 0;
        this.desconto = 0;
        this.id = proximoId++;
    }

    // Getters e setters

    public double alugarQuarto(Quarto quarto, int quantidadeDias) {
        if (quarto.isDisponivel()) {
            double valorEstadia = quarto.calcularPrecoDiaria() * quantidadeDias * (1 - desconto);
            quartosAlugados++;
            diasHospedado += quantidadeDias;
            quarto.setDisponivel(false);
            return valorEstadia;
        } else {
            System.out.println("Quarto não disponível");
            return 0;
        }
    }

    public void darBaixa(Hotel hotel) {
        hotel.darBaixaCliente(this);
    }

    public void calcularDesconto() {
        if (diasHospedado > 0 && desconto < 0.2) {
            desconto += 0.01;
            diasHospedado--;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuartosAlugados() {
        return quartosAlugados;
    }

    public int getId() {
        return id;
    }
}
