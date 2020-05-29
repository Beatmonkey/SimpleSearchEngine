class Publication {

    public static void main(String[] args) {
        Publication pub = new Publication("The new era");
        System.out.println(pub.getInfo());

        Newspaper newspaper = new Newspaper("Footbal results", "Sport news");
        System.out.println(newspaper.getInfo());

        Article article = new Article("Why is the Sun is hot", "Dr James Smith");
        System.out.println(article.getInfo());

        Announcement announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement.getInfo());





    }

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType()  + getDetails();
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return this.title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }


    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return " (source - " + this.source + "): " + super.getDetails();
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return " (author - " + this.author + "): " + super.getDetails();
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return " (days to expire - " + this.daysToExpire + "): " + super.getDetails();
    }
}