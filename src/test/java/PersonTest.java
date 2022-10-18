import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {


        @Test
        public void testDefaultConstructor() {
            // Given
            String expectedName = "";
            Integer expectedAge = Integer.MAX_VALUE;

            // When
            Person person = new Person(expectedName, expectedAge);
                person.setName(expectedName);
                person.setAge(expectedAge);
            // Then
            String actualName = person.getName();
            Integer actualAge = person.getAge();

            Assertions.assertEquals(expectedAge,actualAge);
            Assertions.assertEquals(expectedName,actualName);
        }

        @Test
        public void testConstructorWithName() {
            // Given
            String expected = "Leon";

            // When
            Person person = new Person(expected);
            person.setName(expected);

            // Then
            String actual = person.getName();
            assertEquals(expected, actual);
        }

        @Test
        public void testConstructorWithAge() {
            // Given
            Integer expected = 5;

            // When
            Person person = new Person(expected);
                person.setAge(expected);
            // Then
            Integer actual = person.getAge();
            assertEquals(expected, actual);
        }


        @Test
        public void testConstructorWithNameAndAge() {
            // Given
            Integer expectedAge = 5;
            String expectedName = "Leon";

            // When
            Person person = new Person(expectedName, expectedAge);

            // Then
            Integer actualAge = person.getAge();
            String actualName = person.getName();

            assertEquals(expectedAge, actualAge);
            assertEquals(expectedName, actualName);
        }

        @Test
        public void testSetName() {
            // Given
            String expected = "Leon";

            // When
            Person person = new Person();
            person.setName(expected);

            // Then
            String actual = person.getName();
            assertEquals(expected, actual);
        }

        @Test
        public void testTheLastConctructor(){
            String expectedName = "aqil";
            String expectedLastName = "alhaidari";
            String expectedMiddleName = "aa";
            Integer expectedAge = 23;
            Integer expectedCars = 5;
            Integer expectedHouses = 4;
            String expectedColors = "red";
            // when
            Person person = new Person(expectedName,expectedMiddleName,expectedLastName,expectedColors,expectedCars,expectedAge,expectedHouses);
            //then
            String actualName = person.getName();
            String actualLastName = person.getLastName();
            String actualMiddleName = person.getMiddleName();
            String actualColors = person.getColor();
            Integer actualAge = person.getAge();
            Integer actualCars = person.getCars();
            Integer actualHouses = person.getHouses();
            assertEquals(expectedName,actualName);
            assertEquals(expectedLastName,actualLastName);
            assertEquals(expectedMiddleName,actualMiddleName);
            assertEquals(expectedColors,actualColors);
            assertEquals(expectedAge,actualAge);
            assertEquals(expectedCars,actualCars);
            assertEquals(expectedHouses,actualHouses);


        }



        @Test
        public void testSetAge() {
            // Given
            Integer expected = 5;

            // When
            Person person = new Person();
            person.setAge(expected);

            // Then
            Integer actual = person.getAge();
            assertEquals(expected, actual);
        }
        @Test
    public void testSetColor(){
            //Given
            String expected = "red";
            //When
            Person person = new Person();
            person.setColor(expected);

            //then
            String actual = person.getColor();
            assertEquals(expected,actual);
        }

        @Test
        public void testSetCars(){
            Integer expected = 3;
            //when
            Person person = new Person();
            person.setCars(expected);
            //then
            Integer actual = person.getCars();
            assertEquals(expected,actual);
        }
        @Test
        public void testLastName() {
            String expected = "cam";
            //when
            Person person = new Person();
            person.setLastName(expected);
            //then
            String actual = person.getLastName();
            assertEquals(expected,actual);
        }

        @Test
    public void testSetHouses(){
            Integer expected = 5;
            //when
            Person person = new Person();
            person.setHouses(expected);
            //then
            Integer actual = person.getHouses();
            assertEquals(expected,actual);
        }

        @Test
    public void testSetLastName(){
            String expected = "";
            //when
            Person person = new Person();
            person.setLastName(expected);
            //then
            String actual = person.getLastName();
            assertEquals(expected,actual);
        }

}
