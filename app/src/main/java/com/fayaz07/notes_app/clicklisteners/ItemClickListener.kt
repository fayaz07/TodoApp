package com.fayaz07.notes_app.clicklisteners

import com.fayaz07.notes_app.db.Notes

interface ItemClickListener {

    fun onClick(notes: Notes)

    fun onUpdate(notes: Notes)

}
