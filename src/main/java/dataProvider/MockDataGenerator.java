package dataProvider;

import com.github.javafaker.Faker;

public class MockDataGenerator {

    Faker faker = new Faker();

    public String generateMockFirstName(){
        return faker.name().firstName();
    }


}
