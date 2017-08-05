
DROP TABLE IF EXISTS usertype;
CREATE TABLE usertype(
	id INTEGER PRIMARY KEY autoincrement,
	typename varchar NOT NULL
);
INSERT INTO usertype VALUES (null,'administrator');
INSERT INTO usertype VALUES (null,'user');

DROP TABLE IF EXISTS users;
CREATE TABLE users(
	id INTEGER PRIMARY KEY autoincrement,
	userName VARCHAR NOT NULL,
	loginName VARCHAR NOT NULL,
	password  VARCHAR NOT NULL,
	typeid INT NOT NULL,
	FOREIGN KEY (typeid) REFERENCES usertype(id)
);
CREATE INDEX IX_users_loginname ON users(loginName);
CREATE INDEX IX_users_typeid ON users(typeid);
INSERT INTO users VALUES (null, 'manager','manager','P@ssw0rd','1');
INSERT INTO users VALUES (null, 'admin','admin','P@ssw0rd','1');
DROP TABLE IF EXISTS userProfile; 
CREATE TABLE userProfile(
	id INTEGER PRIMARY KEY autoincrement,
	userId BIGINT NOT NULL,
	telephone char(11),
	currentcountycode varchar,
	destcountycode varchar,
	FOREIGN KEY (userId) REFERENCES users(id),
	FOREIGN KEY (currentcountycode) REFERENCES county(code),
	FOREIGN KEY (destcountycode) REFERENCES county(code)
);
CREATE INDEX IX_userprofile_userid ON userprofile(userId);

