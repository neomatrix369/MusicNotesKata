import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class MusicalNotesBehaviours {

    private static final Note D_NORMAL_NOTE = new Note("D", Tone.NORMAL, 3);
    private static final Note C_NORMAL_NOTE = new Note("C", Tone.NORMAL, 1);
    private static final Note B_NORMAL_NOTE = new Note("B", Tone.NORMAL, 12);

    @Test
    public void shouldReturn_A_Name_And_Tone_For_A_Note() {
        // Given
        Note expectedMusicalNote = new Note("C", Tone.NORMAL, 1);

        // When
        MusicalNotes musicalNotes = new MusicalNotes();
        Note actualMusicalNote = musicalNotes.getNoteUsing("C", Tone.NORMAL);

        System.out.println(actualMusicalNote);
        System.out.println(expectedMusicalNote);

        // Then
        assertThat("Should have returned a note",
                actualMusicalNote,
                Is.is(CoreMatchers.equalTo(expectedMusicalNote)));
    }

    @Test
    public void shouldReturn_A_Name_And_Tone_For_Another_Note() {
        // Given
        Note expectedMusicalNote = D_NORMAL_NOTE;

        // When
        MusicalNotes musicalNotes = new MusicalNotes();
        Note actualMusicalNote = musicalNotes.getNoteUsing("D", Tone.NORMAL);

        // Then
        assertThat("Should have returned a note",
                actualMusicalNote,
                Is.is(CoreMatchers.equalTo(expectedMusicalNote)));
    }

    @Test
    public void shouldReturn_A_D_SharpNote_When_Sharp_D_Is_Invoked() {
        // Given
        Note expectedMusicalNote = new Note("D", Tone.SHARP, 4);

        // When
        MusicalNotes musicalNotes = new MusicalNotes();
        Note actualMusicalNote = musicalNotes.getNextSharpNoteFor(D_NORMAL_NOTE);

        System.out.println(actualMusicalNote);
        System.out.println(expectedMusicalNote);

        // Then
        assertThat("Should have returned a D sharp note",
                actualMusicalNote,
                Is.is(CoreMatchers.equalTo(expectedMusicalNote)));
    }

    @Test
    public void shouldReturn_A_C_NormalNote_When_Sharp_B_Is_Invoked() {
        // Given
        Note expectedMusicalNote = C_NORMAL_NOTE;

        // When
        MusicalNotes musicalNotes = new MusicalNotes();
        Note actualMusicalNote = musicalNotes.getNextSharpNoteFor(B_NORMAL_NOTE);

        System.out.println(actualMusicalNote);
        System.out.println(expectedMusicalNote);

        // Then
        assertThat("Should have returned a C normal note",
                actualMusicalNote,
                Is.is(CoreMatchers.equalTo(expectedMusicalNote)));
    }

    @Test
    public void shouldReturn_A_B_NormalNote_When_Flat_C_Is_Invoked() {
        // Given
        Note expectedMusicalNote = new Note("B", Tone.NORMAL, 12);

        // When
        MusicalNotes musicalNotes = new MusicalNotes();
        Note actualMusicalNote = musicalNotes.getNextFlatNoteFor(C_NORMAL_NOTE);

        System.out.println(actualMusicalNote);
        System.out.println(expectedMusicalNote);
        // Then
        assertThat("Should have returned a B normal note",
                actualMusicalNote,
                Is.is(CoreMatchers.equalTo(expectedMusicalNote)));
    }
}