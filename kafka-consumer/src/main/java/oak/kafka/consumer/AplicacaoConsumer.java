package oak.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import oak.kafka.consumer.eventos.ConsumidorEvento;

@Slf4j
public class AplicacaoConsumer {

    public static void main(String[] args) {
        AplicacaoConsumer aplicacao = new AplicacaoConsumer();
        aplicacao.iniciar();
    }

    private void iniciar() {
        log.info("Iniciando a aplicação");
        ConsumidorEvento consumidor = new ConsumidorEvento();
        consumidor.executar();
    }
}
