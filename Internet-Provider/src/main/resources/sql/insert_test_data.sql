INSERT INTO `provider`.`roles` (`name`) VALUES ('admim');
INSERT INTO `provider`.`roles` (`name`) VALUES ('client');

INSERT INTO `provider`.`services` (`name`, `description`) VALUES ('Інтернет', 'Безлімітні тарифні плани «Інтернет»');
INSERT INTO `provider`.`services` (`name`, `description`) VALUES ('Цифрове ТВ (IPTV)', 'Перегляд каналів у цифровому форматі IPTV ');
INSERT INTO `provider`.`services` (`name`, `description`) VALUES ('Мобільний звязок', 'Міський мобільний звязок');

INSERT INTO `provider`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('«Комфорт 50»', '50 до, Мбіт/с Безлімітні тарифні плани «Інтернет»', '140', '1');
INSERT INTO `provider`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('Розширений', 'Цифрове ТВ (IPTV)', '20', '2');
INSERT INTO `provider`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('Мобільний звязок', 'Міський мобільний звязок', '1', '3');

INSERT INTO `provider`.`contact_details` (`id`, `city`, `street`, `home`, `apartment`, `email`, `phone`) VALUES (1,'Kyiv','Peremogy','23a','12','admin@gmail.com','+380123456789');
INSERT INTO `provider`.`accounts` (`id`, `number`, `balance`) VALUES (1,1,0);
INSERT INTO `provider`.`users` (`login`, `password`, `first_name`, `last_name`, `surname`, `blocked`, `roles_id`, `contact_details_id`, `accounts_id`) 
VALUES ('admin12345678','admin1',' Ivan ','Ivanovich','Ivanov',0,1,1,1);

INSERT INTO `provider`.`contact_details` (`id`, `city`, `street`, `home`, `apartment`, `email`, `phone`) VALUES (2,'Kyiv','ukrainky','32b','21','user@gmail.com','+380987654321');
INSERT INTO `provider`.`accounts` (`id`, `number`, `balance`) VALUES (2,2,0);
INSERT INTO `provider`.`users` (`login`, `password`, `first_name`, `last_name`, `surname`, `blocked`, `roles_id`, `contact_details_id`, `accounts_id`) 
VALUES ('user12345678','user12',' Andrii ','Ivanovich','Ivanov',0,2,2,2);