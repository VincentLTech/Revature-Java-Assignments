DELETE FROM site_user 
WHERE firstname = 'Steve';
/**
 * SQL sublanguage: DML (Data Manipulation Language)
 *
 * The "DELETE" keyword is utilized to remove records based on a condition.
 *
 * The syntax for deleting records from a table is as follows:
 * DELETE FROM table_name WHERE condition;
 *
 * NOTE: Whenever you execute a DELETE statement, have a WHERE condition that identifies exactly what records you would
 * like to delete. Leaving this out will remove ALL records from the table.
 */

    /**
     * Assignment: In the problem1.sql, write the SQL command to delete 'Steve' from the site_user table, assuming
     * that the table and 'Steve' records already exist.
     *
     *        site_user table:
     *        |   id  |     firstname        |
     *        --------------------------------
     *        |1      |'Steve'               |
     *        |2      |'Alexa'               |
     *        |3      |'Steve'               |
     *        |4      |'Brandon'             |
     *        |5      |'Adam'                |
     */