
USE foodbridge_db;

CREATE TABLE donors (
    donor_id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    donor_type ENUM('RESTAURANT','HOTEL','SUPERMARKET','CATERER') NOT NULL,
    contact_number VARCHAR(15),
    location VARCHAR(100) NOT NULL
);

CREATE TABLE food_donations (
    donation_id INT PRIMARY KEY,
    food_name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    quantity DECIMAL(10,2) NOT NULL,
    unit VARCHAR(20) NOT NULL,
    expiry_hours INT NOT NULL,
    quality_status VARCHAR(20) NOT NULL,
    donor_id VARCHAR(10) NOT NULL,
    CONSTRAINT chk_donation_quantity CHECK (quantity > 0),
    CONSTRAINT chk_expiry_hours CHECK (expiry_hours >= 0),
    CONSTRAINT fk_donation_donor
        FOREIGN KEY (donor_id) REFERENCES donors(donor_id)
);

CREATE TABLE ngos (
    ngo_id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    urgency ENUM('LOW','MEDIUM','HIGH','CRITICAL') NOT NULL
);

CREATE TABLE ngo_requirements (
    requirement_id INT AUTO_INCREMENT PRIMARY KEY,
    ngo_id VARCHAR(10) NOT NULL,
    required_category VARCHAR(50) NOT NULL,
    required_quantity DECIMAL(10,2) NOT NULL,
    unit VARCHAR(20) NOT NULL,
    CONSTRAINT chk_required_quantity CHECK (required_quantity > 0),
    CONSTRAINT fk_requirement_ngo
        FOREIGN KEY (ngo_id) REFERENCES ngos(ngo_id)
);

CREATE TABLE matches (
    match_id INT AUTO_INCREMENT PRIMARY KEY,
    donation_id INT NOT NULL,
    ngo_id VARCHAR(10) NOT NULL,
    match_status ENUM('RECOMMENDED','ACCEPTED','REJECTED','COMPLETED')
        NOT NULL DEFAULT 'RECOMMENDED',
    matched_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_match_donation
        FOREIGN KEY (donation_id) REFERENCES food_donations(donation_id),
    CONSTRAINT fk_match_ngo
        FOREIGN KEY (ngo_id) REFERENCES ngos(ngo_id)
);

USE foodbridge_db;
SHOW TABLES;