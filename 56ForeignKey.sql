/**
 * SQL sublanguage: DDL (Data Definition Language)
 * We know how to create tables but, we don't know how to relate tables to one another. This is a crucial part of relational databases.
 * We can relate tables together by utilizing foreign keys.
 * A foreign key is a column in one table that refers to the primary key in another table.
 * For example lets say we have the "artist" table below:
 *      artist table:
 *      |    id    |        artist_name     |
 *      -------------------------------------
 *      |1         |'Beatles'               |
 *      |2         |'Eagles'                |
 *      |3         |'Led Zeppelin'          |
 * Now lets say we want a song table.
 *      song table:
 *      |    id    |        song_name       |
 *      -------------------------------------
 *      |1         |'Let it be'             |
 *      |2         |'Imagine'               |
 *      |3         |'Kashmir'               |
 * Currently, the song table has no reference to the artist that made the song. To make that reference we are going to want to use a foreign key.
 * The songs table with a foreign key would look like the table below
 *      song table with fk:
 *      |    id    |        song_name       |   artist_fk   |
 *      -----------------------------------------------------
 *      |1         |'Let it be'             |1              |
 *      |2         |'Imagine'               |1              |
 *      |3         |'Kashmir'               |3              |
 * The "artist_fk" column would reference the primary key of the "artist" table.
 * If we try to input an "artist_fk" that isn't in the artist table, an exception will be thrown.
 * the syntax for creating the songs table with an artist fk is as follows:
 * CREATE TABLE song (
 *  id SERIAL PRIMARY KEY,
 *  song_name varchar(100),
 *  artist_fk int REFERENCES artist(id)
 * );
 * notice the constraint we add to the artist_fk. We are referencing the id column in the artist table.
 * This is how we create a foreign key.
 * NOTE: Other flavors of SQL might have different syntax for this however for our labs, this is the syntax we will utilize
 */

CREATE TABLE post (
    id SERIAL PRIMARY KEY,
    post varchar(100),
    user_fk int REFERENCES site_user(id)

);

-- ALTER TABLE post ADD user_id INT;
-- ALTER TABLE post ADD FOREIGN KEY (artist_id) REFERENCES artist(id);


/**
         * Assignment: create a "post" table that has the following columns:
         *       post table:
         *       |   id  |     post        |        user_fk         |
         *       ----------------------------------------------------
         *       where the id is of type SERIAL PRIMARY KEY, post is of type varchar(255), and user_fk is of type
         *       int.
         *
         * Note: The post column will hold the text content of the post and the user_fk column will be a foreign key to
         * the site_user table's id column.
         */