package ie.atu.arrays;


class Book {
    private String poet;
    private String nameCover;

    Book(String poet, String nameCover){
        this.poet = poet;
        this.nameCover = nameCover;
    }
    String getName(){
        return poet;
    }

    String getCover(){
        return nameCover;
    }
}