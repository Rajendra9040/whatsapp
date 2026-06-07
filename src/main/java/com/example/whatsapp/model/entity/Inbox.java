package com.example.whatsapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("inbox")
public class Inbox {
    @PrimaryKey
    private ChatParticipant.Key key;

    @Column("created_at")
    private Instant createdAt;

    public static class Key {
        @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
        @Column("client_id")
        private UUID clientId;
        @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED)
        @Column("message_id")
        private UUID messageId;
    }
}
