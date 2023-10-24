Fila de Supermercado em Java
Introdução
Este projeto é uma implementação simples de uma fila de supermercado em Java. O código modela uma fila de clientes em um supermercado e oferece funcionalidades para adicionar e atender clientes.

Pré-requisitos
Java 8 ou superior
Explicação do Código
Classe Cliente
A classe Cliente possui dois campos: nome e numeroDeItens. Essa classe serve para modelar um cliente na fila do supermercado.

Classe FilaSupermercado
Esta classe é o núcleo do projeto. Ela contém:

Um array fila para armazenar os clientes.
Variáveis tamanho, capacidade, inicio e fim para gerenciar a fila.
Métodos para adicionar clientes à fila (entrarNaFila) e atender clientes (atenderCliente).
Método entrarNaFila
Este método adiciona um cliente à fila se ela não estiver cheia.

Método atenderCliente
Este método remove e atende o próximo cliente na fila, se a fila não estiver vazia.

Melhores Práticas de Engenharia de Software
O código é bem organizado e modular, mas pode ser melhorado em termos de encapsulamento. Por exemplo, os campos da classe Cliente podem ser tornados privados com métodos getters públicos.

Conclusão
Este projeto serve como uma base sólida para entender como filas podem ser implementadas em Java. Ele pode ser estendido para incluir mais funcionalidades, como prioridades na fila, múltiplos caixas, entre outros.
