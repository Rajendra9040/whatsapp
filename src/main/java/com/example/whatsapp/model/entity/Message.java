package com.example.whatsapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("message")
public class Message {

    @PrimaryKey
    private UUID id;
    @Column("chat_id")
    private UUID chatId;
    @Column("sender_id")
    private UUID senderId;
    private String content;
    @Column("attachment_url")
    private String attachmentUrl;
    @Column("server_timestamp")
    private Instant serverTimestamp;
}
