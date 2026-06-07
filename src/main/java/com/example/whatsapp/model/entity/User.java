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
@Table("user")
public class User {

    @PrimaryKey
    private UUID id;

    private String username;
    @Column("password_hash")
    private String passwordHash;
    @Column("created_at")
    private Instant createdAt;
    @Column("last_seen_at")
    private Instant lastSeenAt;
}