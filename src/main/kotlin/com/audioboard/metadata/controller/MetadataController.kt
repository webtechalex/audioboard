package com.audioboard.metadata.controller

import com.audioboard.metadata.service.MetadataService
import com.audioboard.metadata.model.FileMetadata
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/metadata")
class MetadataController(val metadataService: MetadataService) {

    @GetMapping("/{id}")
    fun getMetadata(@PathVariable id: String): ResponseEntity<FileMetadata> {
        val metadata = metadataService.getMetadataByUserId(id)
        return if (metadata == null) ResponseEntity.notFound().build()
        else ResponseEntity.ok(metadata)
    }
}