package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    private List<Car> list;

    {
        list = new ArrayList<>();

        Car car1 = new Car(1,"Mazda", "White");
        Car car2 = new Car(2,"Toyota", "Red");
        Car car3 = new Car(3,"Tesla", "Black");
        Car car4 = new Car(4,"Tractor", "Yellow");
        Car car5 = new Car(5,"Opel", "Orange");

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
    }

    @Override
    public List<Car> index(Integer count) {
        if(count == null || count >=5) {
            return list;
        }
        return list.subList(0, count);
    }

}
