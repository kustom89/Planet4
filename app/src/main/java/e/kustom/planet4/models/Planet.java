package e.kustom.planet4.models;


public class Planet {

   private String count, next, previus;
   private Indicator[] results;

    public Planet() {
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevius() {
        return previus;
    }

    public void setPrevius(String previus) {
        this.previus = previus;
    }

    public Indicator[] getResults() {
        return results;
    }

    public void setResults(Indicator[] results) {
        this.results = results;
    }
}
