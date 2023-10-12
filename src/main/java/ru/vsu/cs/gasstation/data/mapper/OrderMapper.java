package ru.vsu.cs.gasstation.data.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vsu.cs.gasstation.data.dto.OrderCreateDto;
import ru.vsu.cs.gasstation.entity.Client;
import ru.vsu.cs.gasstation.entity.Fuel;
import ru.vsu.cs.gasstation.entity.Order;
import ru.vsu.cs.gasstation.service.ClientService;
import ru.vsu.cs.gasstation.service.ClientServiceImpl;
import ru.vsu.cs.gasstation.service.FuelService;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class OrderMapper {

    @Autowired
    private ClientService clientService;
    @Autowired
    private FuelService fuelService;

    @Transactional
    public Order orderCreateDtoToOrder(OrderCreateDto orderCreateDto) {
        Order order = new Order();

        Client client = clientService.getClient(orderCreateDto.getClientId());
        if (client == null) {
            return null;
        }
        order.setClient(client);

        Fuel fuel = fuelService.getFuel(orderCreateDto.getFuelId());
        if (fuel == null) {
            return null;
        }

        int liters = orderCreateDto.getLiters();
        if (liters <= 0){
            return null;
        }


        Date date;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = format.parse(orderCreateDto.getDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        order.setClient(client);
        order.setFuel(fuel);
        order.setLiters(liters);
        order.setSum(liters * fuel.getPrice());
        order.setDate(date);

        return order;
    }
}
