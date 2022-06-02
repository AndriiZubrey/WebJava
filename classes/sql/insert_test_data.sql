INSERT INTO `provider`.`roles` (`name`) VALUES ('admim');
INSERT INTO `provider`.`roles` (`name`) VALUES ('client');

INSERT INTO `provider`.`services` (`name`, `description`) VALUES ('Інтернет', 'Безлімітні тарифниі плани «Інтернет»');
INSERT INTO `provider`.`services` (`name`, `description`) VALUES ('Цифрове ТВ (IPTV)', 'Перегляд каналів в цифровому форматі IPTV ');
INSERT INTO `provider`.`services` (`name`, `description`) VALUES ('Телефонний звязок', 'Міський телефонний звязок');

INSERT INTO `provider`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('«Комфорт 50»', '50 до, Мбит/с Безлімітні тарифниі плани «Інтернет»', '140', '1');
INSERT INTO `provider`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('Розширенний', 'Цифрове ТВ (IPTV)', '20', '2');
INSERT INTO `provider`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('Мобільний звязок', 'Міський телефонний звязок', '1', '3');

INSERT INTO `provider`.`contact_details` (`id`, `city`, `street`, `home`, `apartment`, `email`, `phone`) VALUES (1,'Kyiv','Peremogy','23a','12','admin@gmail.com','+380991234567');
INSERT INTO `provider`.`accounts` (`id`, `number`, `balance`) VALUES (1,1,0);
INSERT INTO `provider`.`users` (`login`, `password`, `first_name`, `last_name`, `surname`, `blocked`, `roles_id`, `contact_details_id`, `accounts_id`) VALUES ('admin12345678','admin1',' Ivan ','Ivanovich','Ivanov',0,1,1,1);