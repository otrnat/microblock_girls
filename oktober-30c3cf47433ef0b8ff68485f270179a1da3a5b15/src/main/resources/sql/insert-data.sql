insert into user (id,
first_name,
email,
username,
password)
values ('001', 'Jan', 'janpolanski@gmail.com', 'janpol3', 'KasiaJan2'),
('002', 'Janina', 'janinakowalski@gmail.com', 'janikowal3', 'Ketchup2'),
('003', 'Natalia', 'nataliao@gmail.com', 'nataliaosuper', 'Natalia1234'),
('004', 'Kutay', 'kutayg@gmail.com', 'kutay2021', 'Kutay1515'),
('005', 'Marlena', 'marlenah@gmail.com', 'marlena39', 'Marlena1517');

insert into follower (id,
follower,
following)
values ('001', 'janpol3', 'janikowal3'),
('002', 'janikowal3', 'nataliaosuper'),
('003', 'nataliaosuper', 'janikowal3'),
('004', 'kutay2021', 'nataliaosuper'),
('005', 'marlena39', 'janikowal3');

insert into post (id, post_time, username, content)
values 
('001', ('2021-11-06 10:23:00'), 'nataliaosuper', 'blablala'),
('002', ('2021-11-06 11:25:00'), 'kutay2021', 'blablalalalalala'),
('003', ('2021-11-06 12:14:00'), 'janikowal3', 'blablala_mamajajajdadh'),
('004', ('2021-11-06 12:16:00'), 'janpol3', 'blablala_mamajajah'),
('005', ('2021-11-06 12:18:00'), 'nataliaosuper', 'blablala_mamajajajdadh');

select *
from follower as f 
join post as p on f.id=p.id
join user as u on u.id=f.id;
