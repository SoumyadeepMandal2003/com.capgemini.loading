# MediConnect - Doctor Appointment Microservices System

## Project Structure
```
MediConnect/
├── ServiceRegistry/      (Eureka Server - Port 8761)
├── ApiGateway/           (API Gateway  - Port 8080)
├── DoctorService/        (Doctor CRUD  - Port 8081 / 8082)
└── AppointmentService/   (Appointment  - Port 8083)
```

## Startup Order (IMPORTANT - follow this sequence)
1. Start **ServiceRegistry** first (Eureka Server must be running before others)
2. Start **DoctorService** on port 8081
3. Start **DoctorService** again on port 8082 (for load balancing demo)
4. Start **AppointmentService**
5. Start **ApiGateway** last

## How to Run Second Doctor Service Instance (Load Balancing)
In IntelliJ:
- Go to Run > Edit Configurations > DoctorServiceApplication
- Add VM Option: -Dserver.port=8082
- Run this second configuration

## Eureka Dashboard
http://localhost:8761

## API Gateway URLs (use these in Postman)
### Doctor APIs
- POST   http://localhost:8080/doctor/doctors
- GET    http://localhost:8080/doctor/doctors
- GET    http://localhost:8080/doctor/doctors/{id}
- PUT    http://localhost:8080/doctor/doctors/{id}
- DELETE http://localhost:8080/doctor/doctors/{id}

### Appointment APIs
- POST   http://localhost:8080/appointment/appointments
- GET    http://localhost:8080/appointment/appointments
- GET    http://localhost:8080/appointment/appointments/{id}
- DELETE http://localhost:8080/appointment/appointments/{id}

## Sample Postman Request Bodies

### Create Doctor (POST /doctor/doctors)
```json
{
    "name": "Dr. Anjali Sharma",
    "specialization": "Cardiologist",
    "experience": 10,
    "hospitalName": "Apollo Hospital",
    "availability": "Available"
}
```

### Book Appointment (POST /appointment/appointments)
```json
{
    "patientName": "Rahul Verma",
    "doctorId": 1,
    "appointmentDate": "2024-03-15"
}
```

## H2 Console (for viewing database)
- Doctor Service:      http://localhost:8081/h2-console  (JDBC URL: jdbc:h2:mem:doctordb)
- Appointment Service: http://localhost:8083/h2-console  (JDBC URL: jdbc:h2:mem:appointmentdb)
