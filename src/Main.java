class Cliente {
    String nome;
    int numeroDeItens;

    public Cliente(String nome, int numeroDeItens) {
        this.nome = nome;
        this.numeroDeItens = numeroDeItens;
    }
}

class FilaSupermercado {
    private Cliente[] fila;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public FilaSupermercado(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Cliente[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public void entrarNaFila(Cliente cliente) {
        if (tamanho < capacidade) {
            fim = (fim + 1) % capacidade;
            fila[fim] = cliente;
            tamanho++;
            System.out.println("Cliente adicionado à fila: " + cliente.nome);
        } else {
            System.out.println("A fila do caixa está cheia. Não é possível adicionar mais clientes.");
        }
    }

    public void atenderCliente() {
        if (!filaVazia()) {
            Cliente clienteAtendido = fila[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            System.out.println("Próximo cliente atendido: " + clienteAtendido.nome + ", Itens comprados: " + clienteAtendido.numeroDeItens);
        } else {
            System.out.println("A fila do caixa está vazia. Não há clientes para atender.");
        }
    }

    public int tamanhoDaFila() {
        return tamanho;
    }

    public boolean filaVazia() {
        return tamanho == 0;
    }
}

class Main {
    public static void main(String[] args) {
        FilaSupermercado filaDoSupermercado = new FilaSupermercado(5); // Tamanho máximo da fila

        filaDoSupermercado.entrarNaFila(new Cliente("Cliente 1", 3));
        filaDoSupermercado.entrarNaFila(new Cliente("Cliente 2", 2));
        filaDoSupermercado.entrarNaFila(new Cliente("Cliente 3", 4));

        System.out.println("Tamanho da fila: " + filaDoSupermercado.tamanhoDaFila());

        filaDoSupermercado.atenderCliente();
        filaDoSupermercado.atenderCliente();
        filaDoSupermercado.atenderCliente();
        filaDoSupermercado.atenderCliente();

        System.out.println("Tamanho da fila: " + filaDoSupermercado.tamanhoDaFila());
    }
}
