use newservlet;

insert into role(code,name) values("ADMIN", "Quản trị hệ thống");
insert into role(code,name) values("USER", "Người ");

insert into user(username,pass,fullname, status, roleid ) values("admin", "123456", "admin", 1,1);
insert into user(username,pass,fullname, status, roleid ) values("Nguyen Van A", "123456", "Nguyen Van A", 1,2);
insert into user(username,pass,fullname, status, roleid ) values("Nguyen Van B", "123456", "Nguyen Van B", 1,2); 

