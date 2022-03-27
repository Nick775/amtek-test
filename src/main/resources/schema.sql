CREATE TABLE parking
(
  id varchar(100) NOT NULL,
  parking_number varchar(4) DEFAULT NULL,
  client_free varchar(4) DEFAULT NULL,
  client_busy varchar(4) DEFAULT NULL,
  vip_busy varchar(4) DEFAULT NULL,
  reserved_free varchar(4) DEFAULT NULL,
  reserved_busy varchar(4) DEFAULT NULL,
  active boolean DEFAULT NULL,
  PRIMARY KEY (id)
);