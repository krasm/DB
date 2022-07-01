public class QueriesSerice {

    IQuery goodQueries;
    IQuery badQueries;

    public QueriesSerice(IQuery goodQueries, IQuery badQueries) {
        this.goodQueries = goodQueries;
        this.badQueries = badQueries;
    }

    public IQuery getGoodQueries() {
        return goodQueries;
    }

    public void setGoodQueries(GoodQueries goodQueries) {
        this.goodQueries = goodQueries;
    }

    public IQuery getBadQueries() {
        return badQueries;
    }

    public void setBadQueries(BadQueries badQueries) {
        this.badQueries = badQueries;
    }
}
