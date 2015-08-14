package com.datasift.dropwizard.kafka.producer;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;

import java.util.List;

/**
 * Interface for {@link Producer} proxies.
 */
public interface KafkaProducer<K, V> {

    void send(String topic, V message);

    void send(String topic, K key, V message);

    void send(KeyedMessage<K, V> message);

    void send(List<KeyedMessage<K, V>> messages);

    void close();
}
