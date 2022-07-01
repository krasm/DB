public class QueriesSerice {

    GoodQueries goodQueries;
    BadQueries badQueries;

    public QueriesSerice(GoodQueries goodQueries, BadQueries badQueries) {
        this.goodQueries = goodQueries;
        this.badQueries = badQueries;
    }

    public GoodQueries getGoodQueries() {
        return goodQueries;
    }

    public void setGoodQueries(GoodQueries goodQueries) {
        this.goodQueries = goodQueries;
    }

    public BadQueries getBadQueries() {
        return badQueries;
    }

    public void setBadQueries(BadQueries badQueries) {
        this.badQueries = badQueries;
    }
}
