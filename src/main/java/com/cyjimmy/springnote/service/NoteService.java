package com.cyjimmy.springnote.service;

import com.cyjimmy.springnote.model.Note;

import java.util.List;

public interface NoteService {
    public void addNote(Note note);
    public List<Note> getAllNotes();
}
