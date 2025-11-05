public class Document {
    private String title;
    private Person[] authors = new Person[5];

    public Document(String title, Person[] authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person[] getAuthors() {
        return authors;
    }

    public void setAuthors(Person[] authors) {
        this.authors = authors;
    }

    public int NbAuthor2(){
        int n=0;
        for (int i=0;i<=authors.length;i++){
            if (authors[i]!=null){
                n++;
            }
        }
        return n;
    }
    public int NbAuthor1(){
        int n=0;
        for(Person a : authors){
            if (a!=null){
                n++;
            }
        }
        return n;
    }
    @Override
    public String toString(){
        String out= "";
        for (Person a: authors){
            if (a!=null){
                out = out + a.getFirstname() + " " + a.getLastname()+ " ,";
            }

        }
        return out;
    }
}