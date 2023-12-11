package com.audioboard.metadata.repository

import com.audioboard.metadata.model.FileMetadata
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface FileMetadataRepository : CrudRepository<FileMetadata, UUID> {
}