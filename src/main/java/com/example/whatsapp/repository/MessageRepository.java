package com.example.whatsapp.repository;

import com.example.whatsapp.model.entity.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, UUID> {


}
