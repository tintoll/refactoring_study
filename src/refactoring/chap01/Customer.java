package refactoring.chap01;


import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    public String getName() {
        return _name;
    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "<H1><EM>"+ getName() + " 고객님의 대여 기록</EM></H1>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // 이번에 대여하는 비디오 정보와 대여료를 출력
            result += "\t" + each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"<BR>\n";
        }

        // 푸터 행 추가
        result += "<P>누적 대여료 : <EM>"+ String.valueOf(getTotalCharge()) + "</EM></P>\n";
        result += "<P>적립 포인트 : <EM>"+ String.valueOf(getTotalFrequentRenterPoints())+"</EM></P>\n";

        return result;
    }
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
