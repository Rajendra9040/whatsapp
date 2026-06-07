package com.example.whatsapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("chat_participant")
public class ChatParticipant {
    @PrimaryKey
    private Key key;
    @Column("joined_at")
    private Instant joinedAt;

    @PrimaryKeyClass
    public static class Key {
        @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
        @Column("chat_id")
        private UUID chatId;

        @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED)
        @Column("user_id")
        private UUID userId;
    }
}
