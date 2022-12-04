package movies;

public class Movie {
    private String name;
    private String category;

    public String Movie(){
        return this.name;
    }

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public Movie(String category){
        this.category = category;
    }

    public String getMovieName(String movieName){
        return name;
    }

    public String getCategory(){
        return this.category;
    }
}
