import java.util.ArrayList;
import java.util.List;

public class ArtistsImplementation implements Artists, Searchable {
    private ArrayList<Artist> artistsList = new ArrayList<>();

    public ArtistsImplementation() {
    }

    @Override
    public void add(Artist artist) {
        this.artistsList.add(artist);
    }

    @Override
    public Artist get(int index) {
        if (index >= 0 && index < artistsList.size()) {
            return artistsList.get(index);
        } else {
            return null; // Handle index out of bounds appropriately
        }
    }

    @Override
    public List<Artist> search(String searchTerm) {
        List<Artist> matchingArtists = new ArrayList<>();

        for (Artist artist : artistsList) {
            if (artist.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                matchingArtists.add(artist);
            }
        }

        return matchingArtists;
    }
}
