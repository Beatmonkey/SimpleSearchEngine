class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors; 
    
    String getTitle() {
        return this.title;
    }

    String setTitle(String title) {
        return this.title = title;
    }

    int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    int setYearOfPublishing(int yearOfPublishing) {
        return this.yearOfPublishing = yearOfPublishing;
    }

    String[] getAuthors() {
        return this.authors;
    }

    String[] setAuthors(String[] authors) {
        return this.authors = authors;

    }  
}
