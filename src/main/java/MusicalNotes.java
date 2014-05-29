import java.util.Arrays;
import java.util.List;

public class MusicalNotes {

    private List<Note> notes = Arrays.asList(
        new Note("C", Tone.NORMAL, 1),
        new Note("C", Tone.SHARP, 2),
        new Note("D", Tone.FLAT, 2),
        new Note("D", Tone.NORMAL, 3),
        new Note("D", Tone.SHARP, 4),
        new Note("E", Tone.FLAT, 4),
        new Note("E", Tone.NORMAL, 5),
        new Note("F", Tone.NORMAL, 6),
        new Note("F", Tone.SHARP, 7),
        new Note("G", Tone.FLAT, 7),
        new Note("G", Tone.NORMAL, 8),
        new Note("G", Tone.SHARP, 9),
        new Note("A", Tone.FLAT, 9),
        new Note("A", Tone.NORMAL, 10),
        new Note("A", Tone.SHARP, 11),
        new Note("B", Tone.FLAT, 11),
        new Note("B", Tone.NORMAL, 12)
    );

    public Note getNoteUsing(String name, Tone tone) {
        for (Note note: notes) {
            if (note.getName().equals(name) &&
                note.getTone() == tone) {
                return note;
            }
        }
        throw new IllegalArgumentException("Note not found!");
    }

    public Note getNextSharpNoteFor(Note inNote) {
       int index = notes.indexOf(inNote) + 1;
        if (index == notes.size()) {
            index = 0;
        }
       return notes.get(index);
    }

    public Note getNextFlatNoteFor(Note inNote) {
        int index = notes.indexOf(inNote) - 1;
        if (index == -1) {
            index = notes.size() - 1;
        }
        return notes.get(index);
    }
}
