package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements Carservice {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Nissan", "green", 180));
        cars.add(new Car("Mazeratti", "yellow", 240));
        cars.add(new Car("Zhiguli", "blue", 70));
        cars.add(new Car("BMW", "black", 200));
        cars.add(new Car("Audi", "white", 190));
    }

    @Override
    public List<Car> carCount(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
