package com.example.whatsapp.repository;


import com.example.whatsapp.model.entity.Inbox;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface InboxRepository extends ReactiveCrudRepository<Inbox, UUID> {

    Flux<Inbox> findByRecipientId(UUID recipientId);

    @Query("DELETE FROM inbox WHERE recipient_id = :recipientId AND message_id = :messageId")
    Mono<Void> deleteByRecipientIdAndMessageId(UUID recipientId, UUID messageId);

}
