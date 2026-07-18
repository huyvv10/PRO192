
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int sum = 0;
        for (Car i : t) {
            sum += i.getRate();
        }
        return sum / t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int max = t.get(0).getRate(), min = t.get(0).getRate();
        //Tim gia tri max rate va gia tri min rate.
        for (Car car : t) {
            if (car.getRate() > max) {
                max = car.getRate();
            }
            if (car.getRate() < min) {
                min = car.getRate();
            }
        }
        int posMax = 0, posMin = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() == max) {
                posMax = i;
                break;
            }
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() == min) {
                posMin = i;
                break;
            }
        }
        Car tmp;
        tmp = t.get(posMax);
        t.set(posMax, t.get(posMin));
        t.set(posMin, tmp);
    }

    @Override
    public void f3(List<Car> t) {
        t.sort(Comparator.comparing(Car::getMaker)
                .thenComparing(Car::getRate, Comparator.reverseOrder()));
    }

}
