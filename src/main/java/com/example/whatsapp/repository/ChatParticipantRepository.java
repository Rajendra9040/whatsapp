package com.example.whatsapp.repository;


import com.example.whatsapp.model.entity.ChatParticipant;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface ChatParticipantRepository extends ReactiveCrudRepository<ChatParticipant, UUID> {

    Flux<ChatParticipant> findByChatId(UUID chatId);

    Mono<Boolean> existsByChatIdAndUserId(UUID chatId, UUID userId);

}
