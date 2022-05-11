CREATE TABLE customer (
	customer_id uuid DEFAULT uuid_generate_v4 (),
	first_name VARCHAR NOT NULL,
	last_name VARCHAR NOT NULL,
	email VARCHAR NOT NULL,
	phone VARCHAR,
	cpf VARCHAR,
	gender VARCHAR,
	birth_date DATE,
	created_at TIMESTAMP,
	last_access TIMESTAMP,
	active_user BOOLEAN,
	account_type VARCHAR,
	PRIMARY KEY (customer_id)

);