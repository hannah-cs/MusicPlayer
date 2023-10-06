public class ArtistImplementation implements Artist {
    private String name;

    public ArtistImplementation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}