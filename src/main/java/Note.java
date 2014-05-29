public class Note  {
    private String name;
    private int pitch;
    private Tone tone;

    public Note(String name, Tone tone, int pitch) {
        this.name = name;
        this.pitch = pitch;
        this.tone = tone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (pitch != note.pitch) return false;
        if (!name.equals(note.name)) return false;
        if (tone != note.tone) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + pitch;
        result = 31 * result + tone.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String noteString = tone.toNotation();
        return "Note{" +
                "name='" + name + '\'' +
                ", pitch=" + pitch +
                ", tone=" + tone +
                ", actual notation=" + noteString +
                '}';
    }

    public Tone getTone() {
        return tone;
    }
}
