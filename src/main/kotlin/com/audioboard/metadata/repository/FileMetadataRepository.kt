package com.audioboard.metadata.repository

import com.audioboard.metadata.model.FileMetadata
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import java.util.*

interface FileMetadataRepository : CrudRepository<FileMetadata, UUID> {
    @Query("SELECT * FROM FILE_METADATA WHERE owner = :owner")
    fun findByOwner(@Param("owner") owner: UUID?): List<FileMetadata?>?
}