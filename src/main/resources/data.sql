
delete from branch;
ALTER TABLE branch AUTO_INCREMENT = 1;
insert into branch(city,address,branch_manager) values ("New York","123 Broadway St", "John Smith");
insert into branch(city,address,branch_manager) values ("Los Angeles","Sunset Blvd", "Sarah Johnson");
insert into branch(city,address,branch_manager) values ("Chicago","Michigan Ave", "Mike Brown");

delete from membership_applications;
INSERT INTO membership_applications (applicant_name, email, license_number, status, submission_date)
VALUES ('John Doe', 'john.doe@example.com', 'UAE-1234567', 'PENDING', '2026-04-24');

INSERT INTO membership_applications (applicant_name, email, license_number, status, submission_date)
VALUES ('Jane Smith', 'jane.smith@example.com', 'UAE-9876543', 'APPROVED', '2026-04-21');

INSERT INTO membership_applications (applicant_name, email, license_number, status, submission_date)
VALUES ('Mike Johnson', 'mike.j@example.com', 'UAE-5555555', 'REJECTED', '2026-04-16');

delete from cars;
TRUNCATE TABLE cars;

INSERT INTO cars (brand, model, year, price_per_day, available, number_of_seats) VALUES
                                                                                     ('Ferrari', '488 GTB', 2023, 2500.00, true, 2),
                                                                                     ('Ferrari', 'SF90 Stradale', 2024, 3200.00, true, 2),
                                                                                     ('Lamborghini', 'Urus', 2024, 3000.00, true, 5),
                                                                                     ('Lamborghini', 'Huracan EVO', 2023, 2800.00, true, 2),
                                                                                     ('Rolls Royce', 'Ghost', 2023, 4000.00, true, 5),
                                                                                     ('Rolls Royce', 'Cullinan', 2024, 5000.00, true, 5),
                                                                                     ('Bentley', 'Continental GT', 2022, 3500.00, false, 4),
                                                                                     ('Bentley', 'Bentayga', 2023, 3800.00, true, 5),
                                                                                     ('McLaren', '720S', 2024, 2800.00, true, 2),
                                                                                     ('McLaren', 'Artura', 2023, 2600.00, false, 2),
                                                                                     ('Porsche', 'Cayenne Turbo', 2023, 1800.00, true, 5),
                                                                                     ('Porsche', '911 GT3', 2024, 2200.00, true, 2),
                                                                                     ('Bugatti', 'Chiron', 2023, 8000.00, false, 2),
                                                                                     ('Aston Martin', 'DB12', 2024, 2700.00, true, 4),
                                                                                     ('Mercedes', 'G63 AMG', 2024, 2000.00, true, 5);