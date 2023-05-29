# spring-jpa-testing

Based on a course on Pluralsight Spring Framework 2: Creating Your First Spring Boot Application.

Simple REST Spring Boot Server App using Jakarta Persistence API.

Laita postmanista osoitteeseen localhost:8081/api/v1/sessions postilla JSON:

```
{
    "sessionName": "Dan's Great Session Extravaganza",
    "sessionDescription": "This will be one of the best conference sessions you might ever attend. Come and see how awesome it is for yourself",
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
            "speakerBio": "Pitka ja holmo"
        },
        {
            "firstName": "Patka",
            "lastName": "Entiia",
            "title": "Kihauttelia",
            "company": "Pekka ja Patka",
            "speakerBio": "Lyhyt ja holm"
        }
    ]
}
```
