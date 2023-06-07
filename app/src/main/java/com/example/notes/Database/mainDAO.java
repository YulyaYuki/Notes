package com.example.notes.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.notes.Models.Notes;

import java.util.List;

@Dao
public interface mainDAO {

    @Insert (onConflict = REPLACE)
    void insert (Notes notes);

    @Query("SELECT * FROM notes ORDER BY ID DESC")
    List<Notes> getAll();

    @Query("UPDATE notes SET title=:title, notes=:notes WHERE ID=:id")
    void update(int id, String title, String notes);


}
