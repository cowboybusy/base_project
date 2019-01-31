//package com.wsw.kafka.producer;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.clients.producer.internals.Sender;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//

////@Configuration
////@EnableKafka
//public class KafkaProducerConfig {
//    @Value("${spring.kafka.producer.bootstrap-servers}")
//    private String servers;
//    @Value("${spring.kafka.producer.retries}")
//    private int retries;
//    @Value("${spring.kafka.producer.batch-size}")
//    private int batchSize;
//    @Value("${spring.kafka.producer.buffer-memory}")
//    private int bufferMemory;
//    @Value("${spring.kafka.producer.key-serializer}")
//    private String keySerializer;
//    @Value("${spring.kafka.producer.value-serializer}")
//    private String valueSerializer;
//
//    //@Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//        return new KafkaTemplate(producerFactory());
//    }
//
//    public ProducerFactory<String, String> producerFactory() {
//        return new DefaultKafkaProducerFactory<>(producerConfigs());
//    }
//
//    public Map<String, Object> producerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
//        props.put(ProducerConfig.RETRIES_CONFIG, retries);
//        props.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
//        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, bufferMemory);
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializer);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializer);
//        return props;
//    }
//}
