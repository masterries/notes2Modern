package de.ries.notes.feature_note.presentation.notes

import de.ries.notes.feature_note.domain.model.Note
import de.ries.notes.feature_note.domain.util.NoteOrder
import de.ries.notes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
