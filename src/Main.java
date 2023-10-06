import java.util.List;
import java.util.ArrayList;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArtistsImplementation artistsImplementation = new ArtistsImplementation();
        artistsImplementation.add(new ArtistImplementation("Rolling Stones"));
        artistsImplementation.add(new ArtistImplementation("Stone Roses"));
        artistsImplementation.add(new ArtistImplementation("Guns and Roses"));
        List<Artist> matchingArtists = artistsImplementation.search("stone");
        System.out.println("Found " + matchingArtists.size() + " results:");
        for (Artist artist : matchingArtists) {
            System.out.println(artist.getName());
        }
    }
}