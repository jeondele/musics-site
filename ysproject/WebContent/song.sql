drop table songs;

create table songs(
  	songName varchar2(50) not null,
    artist varchar2(30) not null,
    genre varchar2(30) not null,
    music varchar2(100) not null,
    score varchar2(100) not null,
 	video varchar2(200) not null	   
);


insert into songs values('Falling in love', '제이레빗', '포크', 'Falling in Love.mp3', ' ', 'https://youtu.be/3pfGLSCggAw');
insert into songs values('Lost Stars', 'Adam Levine', '팝', 'Lost Stars.mp3', ' ', 'https://youtu.be/cL4uhaQ58Rk');
insert into songs values('너랑 나', '아이유', '리듬', '너랑 나.mp3', ' ', 'https://youtu.be/NJR8Inf77Ac');
insert into songs values('너의 의미', '아이유', '발라드', '너의 의미.mp3', ' ', 'https://youtu.be/3Nyp7uHofOk');
insert into songs values('봄을 그리다', '어반자카파', '발라드', '봄을 그리다.mp3', ' ', 'https://youtu.be/uFoCayuOaAE');
insert into songs values('소녀', '이문세', '발라드', '소녀.mp3', ' ', 'https://youtu.be/5twaDXnBnmg');
insert into songs values('예뻐졌다', '박보람', '펑키', '예뻐졌다.mp3', ' ', 'https://youtu.be/uFogEwzH4a0');
insert into songs values('To where you are', 'Josh Groban', '성악', ' ', 'To where you are.pdf', 'https://youtu.be/fIAQCiMIEEQ');
insert into songs values('그녀가 말했다', '권진아', '발라드', ' ', '그녀가 말했다.pdf', 'https://youtu.be/uHUY2aTx8JY');
insert into songs values('술을 찾는 불편한 이유', '김진호', '발라드', ' ', '술을 찾는 불편한 이유.pdf', 'https://youtu.be/c2OHs8E3orA');
insert into songs values('슬픔 속에 그댈 지워야만 해', '정승환', '발라드', ' ', '슬픔 속에 그댈 지워야만 해.pdf', 'https://youtu.be/mjQWDqx2up0');
insert into songs values('시간에 기대어', '고성현', '성악', ' ', '시간에 기대어.pdf', 'https://youtu.be/Vvku4AVxRRk');
insert into songs values('오래된 노래', '스탠딩 에그', '발라드', ' ', '오래된 노래_스탠딩에그.pdf', 'https://youtu.be/bW3XExLBf7A');
insert into songs values('오래된 노래', '김동률', '발라드', ' ', '오래된 노래_김동률.pdf', 'https://youtu.be/VcJBaN0rgS4');
insert into songs values('자랑', '곽진언', '발라드', ' ', '자랑.pdf', 'https://youtu.be/i1iKR49QMxw');
insert into songs values('하망연', '고성현', '성악', ' ', '하망연.pdf', 'https://youtu.be/gKnXgmU2CK0');
select * from songs;


COMMIT;