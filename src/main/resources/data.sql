DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
                      id INT AUTO_INCREMENT  PRIMARY KEY,
                      type VARCHAR(250) NOT NULL,
                      fuel_type VARCHAR(250) NOT NULL,
                      description VARCHAR(250) DEFAULT NULL,
                      number_of_doors INT NOT NULL,
                      horse_power INT NOT NULL
);

INSERT INTO cars (type, fuel_type, description, number_of_doors, horse_power) VALUES
('A3', 'Petrol', 'Audi', 5, 250),
('Cayenne', 'Petrol', 'Porsche', 3, 420),
('M3', 'Petrol', 'BMW', 5, 355);