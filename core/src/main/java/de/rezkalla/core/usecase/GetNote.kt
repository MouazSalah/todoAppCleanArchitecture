package de.rezkalla.core.usecase

import de.rezkalla.core.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(id: Long) = noteRepository.getNote(id)
}