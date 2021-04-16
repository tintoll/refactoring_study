package refactoring.chap01;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
    public int getDaysRented() {
        return _daysRented;
    }

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }
    // 최신물을 이틀 이상 대여하면 2포인트 지급하고 그 외엔 1포인트 지급
    int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
