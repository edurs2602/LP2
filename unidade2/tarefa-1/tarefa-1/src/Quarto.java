public class Quarto {
    private int numero;
    private int andar;
    private String tipo;
    private boolean disponivel;

    public Quarto(int numero, int andar, String tipo) {
        this.numero = numero;
        this.andar = andar;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public double calcularPrecoDiaria() {
        double precoDiaria = 0;

        switch (tipo) {
            case "Simples":
                precoDiaria = 100;
                break;
            case "Casal":
                precoDiaria = 150;
                break;
            case "Luxuoso":
                precoDiaria = 300;
                break;
            case "Presidencial":
                precoDiaria = 500;
                break;
            default:
                System.out.println("Tipo de quarto inválido");
        }

        return precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}