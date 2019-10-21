package lesson15;

import java.util.Set;

public class MoMa {
    private String namePiece;
    private Set<String> typeOfArtPiece;
    private int year;
    private String nameArtist;
    private String description;


    public String printMomo() {
        return "Title: "+ this.namePiece +"\n"+"Type: "+ this.typeOfArtPiece+"\n" +"Artist: "+ this.nameArtist+"\n"+"Year: "+this.year+"\n" +"Description: "+ this.description;
    }

    public MoMa(String namePiece, Set<String> typeOfArtPiece, int year, String nameArtist, String description) {
        this.namePiece = namePiece;
        this.typeOfArtPiece = typeOfArtPiece;
        this.year = year;
        this.nameArtist = nameArtist;
        this.description = description;
    }

    public MoMa(String namePiece, int year) {
        this.namePiece = namePiece;
        this.year = year;
    }

    public String getNamePiece() {
        return namePiece;
    }

    public void setNamePiece(String namePiece) {
        this.namePiece = namePiece;
    }

    public Set<String> getTypeOfArtPiece() {
        return typeOfArtPiece;
    }

    public void setTypeOfArtPiece(Set<String> typeOfArtPiece) {
        this.typeOfArtPiece = typeOfArtPiece;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



