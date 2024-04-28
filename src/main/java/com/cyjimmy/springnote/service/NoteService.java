package com.cyjimmy.springnote.service;

import com.cyjimmy.springnote.model.Note;

import java.util.List;

public interface NoteService {
    public Note addNote(Note note);
    public List<Note> getAllNotes();
}
