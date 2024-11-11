/**
     *
     *      character table
     *      | id |  first_name  |  last_name  |
     *      -----------------------------------
     *      |1   |'Leto'        |'Atreides'   |
     *      |2   |'Vladimir'    |'Harkonnen'  |
     *      |3   |'Jessica'     |'Atreides'   |
     *      |4   |'Paul'        |'Atreides'   |
     *      |5   |'Feyd-Rautha' |'Harkonnen'  |
     *
     */
/**
         * Problem 1: Write a statement below to query the database for all characters. Make sure the results are in
         * ascending order by last name, and first name as a tie-breaker.
         */
SELECT id, first_name, last_name
FROM character
ORDER BY last_name, first_name ASC;