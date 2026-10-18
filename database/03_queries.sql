
USE foodbridge_db;

SELECT
    f.donation_id,
    f.food_name,
    f.category,
    f.quantity,
    f.unit,
    f.expiry_hours,
    d.name AS donor_name,
    d.location AS donor_location
FROM food_donations f
INNER JOIN donors d
    ON f.donor_id = d.donor_id
ORDER BY f.expiry_hours ASC;
