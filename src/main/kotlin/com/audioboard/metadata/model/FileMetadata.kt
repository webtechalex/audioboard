package com.audioboard.metadata.model

import org.springframework.data.annotation.Id
import java.util.UUID

data class FileMetadata(
    @Id
    val id: UUID,
    val fileName: UUID,
    val visibleTrackName: String,
    val extension: String,
    val length: Int,
    val owner: UUID
)