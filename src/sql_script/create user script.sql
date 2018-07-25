

CREATE USER 'hibernate'@'localhost' IDENTIFIED BY '12345';

GRANT ALL PRIVILEGES ON hibernateApp. * TO 'hibernate'@'localhost';
FLUSH PRIVILEGES;


SHOW GRANTS FOR hibernate@localhost;