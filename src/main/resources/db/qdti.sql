DROP TABLE IF EXISTS users;
CREATE TABLE users(
	id INTEGER PRIMARY KEY autoincrement,
	userName VARCHAR NOT NULL,
	loginName VARCHAR NOT NULL,
	password  VARCHAR NOT NULL,
	userType INT NOT NULL
);
CREATE INDEX IX_users_loginname ON users(loginName);
DROP TABLE IF EXISTS userProfile; 
CREATE TABLE userProfile(
	id INTEGER PRIMARY KEY autoincrement,
	userId BIGINT NOT NULL,
	telephone char(11),
	FOREIGN KEY (userId) REFERENCES users(id)
);
CREATE INDEX IX_userprofile_userid ON userprofile(userId);

