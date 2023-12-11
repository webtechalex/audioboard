package com.audioboard.metadata.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table("file_metadata")
data class FileMetadata(
    @Id
    val id: UUID,
    val fileName: UUID,
    val visibleTrackName: String,
    val extension: String,
    val length: Int,
    val owner: UUID
)