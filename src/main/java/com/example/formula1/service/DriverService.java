package com.example.formula1.Service;

import com.example.formula1.model.Driver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DriverService {

    private final List<Driver> driverList;

    public DriverService() {
        driverList = Arrays.asList(
                new Driver(44, "Lewis Hamilton", 44),
                new Driver(33, "Max Verstappen", 33),
                new Driver(77, "Valtteri Bottas", 77),
                new Driver(11, "Sergio Perez", 11),
                new Driver(4, "Lando Norris", 4),
                new Driver(16, "Charles Leclerc", 16),
                new Driver(55, "Carlos Sainz", 55),
                new Driver(3, "Daniel Ricciardo", 3),
                new Driver(10, "Pierre Gasly", 10),
                new Driver(14, "Fernando Alonso", 14),
                new Driver(31, "Esteban Ocon", 31),
                new Driver(5, "Sebastian Vettel", 5),
                new Driver(18, "Lance Stroll", 18),
                new Driver(7, "Kimi Raikkonen", 7),
                new Driver(99, "Antonio Giovinazzi", 99),
                new Driver(22, "Yuki Tsunoda", 22),
                new Driver(47, "Mick Schumacher", 47),
                new Driver(9, "Nikita Mazepin", 9),
                new Driver(63, "George Russell", 63),
                new Driver(6, "Nicholas Latifi", 6)
        );

    }

    public List<Driver> getAllItems() {
        return driverList;
    }
}
