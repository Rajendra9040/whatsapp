package com.example.whatsapp.repository;


import com.example.whatsapp.model.entity.Chat;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChatRepository extends ReactiveCrudRepository<Chat, UUID> {}
