package com.audioboard.metadata.service

import com.audioboard.metadata.model.FileMetadata
import com.audioboard.metadata.repository.FileMetadataRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MetadataService(val fileMetadataRepository: FileMetadataRepository) {
    fun getMetadataByUserId(userId: String): FileMetadata? {
        return fileMetadataRepository.findByIdOrNull(UUID.fromString(userId))
    }
}