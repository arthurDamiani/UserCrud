INSERT INTO USER(name, email, password) VALUES('Damiani', 'arthur.damiani@gmail.com', '$2a$10$RI.4J4NiCvSZ8connjflzubl9K9pjZHukRYB9RxXMgR5nMO9Cg8TC');
INSERT INTO USER(name, email, password) VALUES('Jéssica', 'jessicadesaxavier18@gmail.com', '$2a$10$RI.4J4NiCvSZ8connjflzubl9K9pjZHukRYB9RxXMgR5nMO9Cg8TC');

INSERT INTO PROFILE(id, name) VALUES(1, 'ROLE_MODERADOR');
INSERT INTO PROFILE(id, name) VALUES(2, 'ROLE_ALUNO');

INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(1, 1);
INSERT INTO USER_PROFILES(user_id, profiles_id) VALUES(2, 2);