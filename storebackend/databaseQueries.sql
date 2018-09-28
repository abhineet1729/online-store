CREATE TABLE category(

	id IDENTITY,
	name VARCHAR(500),
	description VARCHAR(50000),
	image_url VARCHAR(5000),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY(id)

);
insert into category (name,description,image_url,is_active)
values
("Staples and Miscellaneous Foods",
"This category is for dried herbs and other spices. Sugar, sugar substitutes, flour and other items used for baking may also fall in this area.",
"https://img.hunkercdn.com/640/photos.demandstudios.com/getty/article/103/93/95216126.jpg",
true
);