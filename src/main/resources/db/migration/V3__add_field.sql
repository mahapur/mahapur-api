ALTER TABLE help_info
    DROP COLUMN name,
    DROP COLUMN contact,
    DROP COLUMN help_type;

ALTER TABLE help_info
    ADD COLUMN name VARCHAR(50),
    ADD COLUMN contact VARCHAR(15),
    ADD COLUMN help_type VARCHAR(40);