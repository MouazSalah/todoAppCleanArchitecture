package de.rezkalla.core.usecase

import de.rezkalla.core.repository.NoteRepository

class GetAllNotes(private val noteRepository: NoteRepository) {

    suspend operator fun invoke()= noteRepository.getAllNotes()
}