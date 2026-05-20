================================================
-- DriveMate Database Setup Script
-- Run this file in MySQL Workbench FIRST
-- before running the project
-- ================================================
 
-- Step 1: Create the database
CREATE DATABASE IF NOT EXISTS drivemate_db;
 
-- Step 2: Select it
USE drivemate_db;
 
-- Step 3: Create the instructors table
CREATE TABLE IF NOT EXISTS instructors (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    first_name      VARCHAR(50)   NOT NULL,
    last_name       VARCHAR(50)   NOT NULL,
    email           VARCHAR(100)  NOT NULL UNIQUE,
    phone           VARCHAR(20)   NOT NULL,
    password        VARCHAR(255)  NOT NULL,
    license_number  VARCHAR(50)   NOT NULL,
    school_name     VARCHAR(100)  NOT NULL,
    vehicle_reg     VARCHAR(20)   NOT NULL,
    created_at      TIMESTAMP     DEFAULT CURRENT_TIMESTAMP
);
 
-- ================================================
-- OPTIONAL: Insert a test instructor to test login
-- Uncomment the lines below to use it
-- ================================================
-- INSERT INTO instructors
--   (first_name, last_name, email, phone, password, license_number, school_name, vehicle_reg)
-- VALUES
--   ('Lesego', 'Lebese', 'lesego@drivemate.co.za', '0712345678',
--    'password123', 'RSA-DI-001', 'Cape Drive Academy', 'CA 123-456');