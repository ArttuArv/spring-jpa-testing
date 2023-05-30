# spring-jpa-testing

Based on a course on Pluralsight Spring Framework 2: Creating Your First Spring Boot Application.

Simple REST Spring Boot Server App using Jakarta Persistence API.

Vaihda `application.properties` -filusta tietokannan tiedot.
Ohjelma on tehty `JDK17:lla`, ni vaihda sekin IDE:stä tarvittaessa.

Laita postmanista osoitteeseen localhost:8081/api/v1/sessions postilla JSON:

```
{
    "sessionName": "Maailman paras sessio",
    "sessionDescription": "Maailman paras sessio. Nyt jos koskaan kannattaa tulla katsomaan millaista paskaa on tarjolla.",
    "sessionLength": 45,
    "venueName": "Jaahalli",
    "venueCity": "Pori",
    "attendees": [
        {
            "firstName": "Mauri",
            "lastName": "Pekkarinen"
        },
        {
            "firstName": "Risto",
            "lastName": "Ryti"
        }
    ],
    "speakers": [
        {
            "firstName": "Pekka",
            "lastName": "Puupaa",
            "title": "Mhestari",
            "company": "Pekka ja Patka",
            "speakerBio": "Pitka ja holmo",
            "address": {
                "street": "Kotikatu",
                "city": "Kotikaupunki",
                "zipCode": 1234
            }
        },
        {
            "firstName": "Patka",
            "lastName": "Entiia",
            "title": "Kihauttelia",
            "company": "Pekka ja Patka",
            "speakerBio": "Lyhyt ja holm0",
            "address": {
                "street": "Kotikatu",
                "city": "Kotikaupunki",
                "zipCode": 1234
            }
        }
    ]
}
```
