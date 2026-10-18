
USE foodbridge_db;

-- 1. Insert the donor
INSERT INTO donors
    (donor_id, name, donor_type, contact_number, location)
VALUES
    ('D001', 'Royal Restaurant', 'RESTAURANT',
     '9876543210', 'Aurangabad');

-- 2. Insert the four food donations
INSERT INTO food_donations
    (donation_id, food_name, category, quantity, unit,
     expiry_hours, quality_status, donor_id)
VALUES
    (101, 'Rice', 'Cooked Food', 50, 'kg', 8, 'GOOD', 'D001'),
    (102, 'Bread', 'Bakery', 20, 'kg', 5, 'GOOD', 'D001'),
    (103, 'Vegetables', 'Fresh Produce', 35, 'kg', 24, 'GOOD', 'D001'),
    (104, 'Meals', 'Cooked Food', 40, 'kg', 2, 'GOOD', 'D001');

-- 3. Insert the two NGOs
INSERT INTO ngos
    (ngo_id, name, location, urgency)
VALUES
    ('N001', 'Helping Hands', 'Aurangabad', 'HIGH'),
    ('N002', 'Hope Foundation', 'Aurangabad', 'MEDIUM');

-- 4. Insert their food requirements
INSERT INTO ngo_requirements
    (ngo_id, required_category, required_quantity, unit)
VALUES
    ('N001', 'Cooked Food', 30, 'kg'),
    ('N002', 'Fresh Produce', 25, 'kg');

SELECT * FROM food_donations;

SELECT * FROM ngos;
