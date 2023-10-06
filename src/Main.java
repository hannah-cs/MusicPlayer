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

        System.out.println("Search task:");
        List<Artist> matchingArtists = artistsImplementation.search("stone");
        System.out.println("Found " + matchingArtists.size() + " results:");
        for (Artist artist : matchingArtists) {
            System.out.println(artist.getName());
        }

        System.out.println("___");

        System.out.println("CSV task:");
        List<Artist> csv = artistsImplementation.getArtists();
        StringBuilder csvOutput = new StringBuilder();
        for (Artist artist : csv) {
            csvOutput.append(artist.getName()).append("\n");
        }
        System.out.println(csvOutput.toString());
    }
}