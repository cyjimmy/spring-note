package com.cyjimmy.springnote.controller;

import com.cyjimmy.springnote.model.Note;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class NoteController {
    @GetMapping("/getAllNote")
    public List<Note> getAllNote() {
        return null;
    }

    @PostMapping("/addNote")
    public String addNote(@RequestBody Note note) {
        return "New note added.";
    }
}
