CREATE database gas_station;

use gas_station;

CREATE TABLE fuels(
                      id int primary key AUTO_INCREMENT,
                      octane int not null,
                      mark varchar(20) not null,
                      price int not null
);

CREATE TABLE clients(
                        id int primary key AUTO_INCREMENT,
                        auto varchar(20) not null
);

CREATE TABLE orders(
                       id int primary key AUTO_INCREMENT,
                       client_id int NOT NULL,
                       fuel_id int NOT NULL,
                       order_date date NOT NULL,
                       liters int NOT NULL,
                       sum decimal(10, 2) NOT NULL,

                       foreign key (client_id) references clients(id),
                       foreign key (fuel_id) references fuels(id)
)