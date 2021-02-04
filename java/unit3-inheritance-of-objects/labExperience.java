import java.util.ArrayList;
public class Song extends ArrayList<Note> {
    
    public Song() {	//creates an empty list of Notes
        new ArrayList<Note>();
    }
    
    public String getNotes() {
        String song = "";
        for(Note n : this) {
            song += n.toString() + "\t";
        }
        return song;
    }
    public String getLyrics() {
        String lyrics = "";
        for(Note n : this) {
            lyrics += n.getLyric() + "\t";
        }
        return lyrics;
    }
    public String getSymbols() {
        String symbols = "";
        for(Note n : this) {
            symbols += n.getSymbol() + "\t";
        }
        return symbols;
    }
    
}
public abstract class Note {
	private double amountOfNotes;
	private String name;
	private String pitch;
	private String lyric;
	
	public Note(double notesAmount, String noteName, String pitchType, String lyricS) {
		amountOfNotes = notesAmount;
		name = noteName;
		pitch = pitchType;
		lyric = lyricS;
	}
	public double getNotesAmount() {
		return amountOfNotes;
	}
	public String getName() {
		return name;
	}
	public String getPitch() {
		return pitch;
	}
	public String getLyric() {
		return lyric;
	}
	public void changePitch(String pitchChanger) {
		pitch = pitchChanger;
	}
	public String toString() {
		return pitch + "(" + getNotesAmount() + ")"; 
	}
	public abstract String getSymbol();
}
public class MusicSheet extends Song {
	public static void main (String[] args) {
		Song happyBirthday = new Song();
		Song letItGo = new Song();
		
		letItGo.add(new QuarterNote("", "The"));
		letItGo.add(new QuarterNote("", "snow"));
		letItGo.add(new QuarterNote("", "glows"));
		letItGo.add(new QuarterNote("", "while"));
		letItGo.add(new EigthNote("", "on the"));
		letItGo.add(new SixteenthNote("", "moun-tain to - night"));
		letItGo.add(new EigthNote("", "not a"));
		letItGo.add(new QuarterNote("", "foot"));
		letItGo.add(new QuarterNote("", "pri"));
		letItGo.add(new SixteenthNote("", "- nt to be seen."));
		letItGo.add(new QuarterNote("", "A"));
		letItGo.add(new SixteenthNote("", "king-dom of i"));
		letItGo.add(new QuarterNote("", " - "));
		letItGo.add(new EigthNote("", "so - la"));
		letItGo.add(new QuarterNote("", " - "));
		letItGo.add(new QuarterNote("", "tio"));
		letItGo.add(new QuarterNote("", "n___"));
		letItGo.add(new EigthNote("", "and it"));
		letItGo.add(new QuarterNote("", "looks"));
		letItGo.add(new QuarterNote("", "like"));
		letItGo.add(new SixteenthNote("", "___I'm the queen"));
		
		
		/* happyBirthday.add(new QuarterNote("D", "A"));
		happyBirthday.add(new QuarterNote("D", "B"));
		happyBirthday.add(new QuarterNote("D", "C"));
		happyBirthday.add(new QuarterNote("D", "D"));
		happyBirthday.add(new QuarterNote("G", "E"));
		happyBirthday.add(new QuarterNote("G", "F"));
		happyBirthday.add(new HalfNote("D", "G"));
		happyBirthday.add(new QuarterNote("G", "H"));
		happyBirthday.add(new QuarterNote("G", "I"));
		happyBirthday.add(new QuarterNote("D", "J"));
		happyBirthday.add(new QuarterNote("D", "K"));
		happyBirthday.add(new SixteenthNote("A", "L  M  N  O"));
		happyBirthday.add(new HalfNote("D", "P"));
		happyBirthday.add(new QuarterNote("D", "Q"));
		happyBirthday.add(new QuarterNote("D", "R"));
		happyBirthday.add(new QuarterNote("G", "S"));
		happyBirthday.add(new QuarterNote("G", "and"));
		happyBirthday.add(new QuarterNote("D", "T"));
		happyBirthday.add(new QuarterNote("D", "U"));
		happyBirthday.add(new HalfNote("A", "V"));
		happyBirthday.add(new QuarterNote("D", "dou"));
		happyBirthday.add(new QuarterNote("D", "ble"));
		happyBirthday.add(new QuarterNote("G", "u"));
		happyBirthday.add(new QuarterNote("G", "and"));
		happyBirthday.add(new QuarterNote("D", "X"));
		happyBirthday.add(new QuarterNote("D", "Y"));
		happyBirthday.add(new HalfNote("A", "Z"));
		happyBirthday.add(new QuarterNote("D", "Now"));
		happyBirthday.add(new QuarterNote("D", "I've"));
		happyBirthday.add(new QuarterNote("D", "said"));
		happyBirthday.add(new QuarterNote("D", "my"));
		happyBirthday.add(new QuarterNote("G", "A"));
		happyBirthday.add(new QuarterNote("G", "B"));
		happyBirthday.add(new HalfNote("D", "C"));
		happyBirthday.add(new QuarterNote("G", "Tell"));
		happyBirthday.add(new QuarterNote("G", "me"));
		happyBirthday.add(new QuarterNote("D", "what"));
		happyBirthday.add(new QuarterNote("D", "you"));
		happyBirthday.add(new QuarterNote("A", "think"));
		happyBirthday.add(new QuarterNote("A", "of"));
		happyBirthday.add(new HalfNote("D", "me")); */
		
		System.out.println(letItGo.getSymbols());
		System.out.println(letItGo.getNotes());
		System.out.println(letItGo.getLyrics()); 
		/* System.out.println(happyBirthday.getSymbols());
		System.out.println(happyBirthday.getNotes());
		System.out.println(happyBirthday.getLyrics()); */
	}
	/* song from https://www.irish-folk-songs.com/the-abc--alphabet-sheet-music-and-notes-on-tin-whistle.html */
}
public class WholeNote extends Note {
	
	public WholeNote(String pitchType, String lyricS) {
		super((int)1, "WholeNote", pitchType, lyricS);
	}
	public String getSymbol() {
		return "(o)";
	}
	
}
public class HalfNote extends Note {
	
	public HalfNote(String pitchType, String lyricS) {
		super((double)1/2, "HalfNote", pitchType, lyricS);
	}
	public String getSymbol() {
		return "(o|)";
	}
	
}
public class QuarterNote extends Note {
	
	public QuarterNote(String pitchType, String lyricS) {
		super((double)1/4, "QuarterNote", pitchType, lyricS);
	}
	public String getSymbol() {
		return "(.|)";
	}
	
}
public class EigthNote extends Note {
	
	public EigthNote(String pitchType, String lyricS) {
		super(1/8, "EigthNote", pitchType, lyricS);
	}
	public String getSymbol() {
		return "(.|\\)";
	}
}
public class SixteenthNote extends Note {
	
	public SixteenthNote(String pitchType, String lyricS) {
		super((double)1/8, "EigthNote", pitchType, lyricS);
	}
	public String getSymbol() {
		return "(.|\\\\))";
	}
}

