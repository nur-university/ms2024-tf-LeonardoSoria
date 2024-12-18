# Nutritional Assistance Service

The **Nutritional Assistance Service** is a microservice designed to manage nutrition and health-related workflows. It provides RESTful APIs for handling appointments, analysis requests and results, and nutritional plans. This service integrates seamlessly into larger systems, enabling effective client management and data flow.

## Features

### Appointment Management

- **Create Appointment**
  - **Endpoint**: `POST /api/appointment/create`
  - Creates a new appointment for a client.
  - **Request Body**:
    ```json
    {
      "clientId": "UUID",
      "appointmentDate": "yyyy-MM-dd"
    }
    ```
  - **Response**: Details of the created appointment.

- **Add Analysis Request**
  - **Endpoint**: `POST /api/appointment/addRequest`
  - Adds an analysis request to an existing appointment.
  - **Request Body**:
    ```json
    {
      "appointmentId": "UUID",
      "requestedDate": "yyyy-MM-dd"
    }
    ```
  - **Response**: Updated appointment with the analysis request.

- **Get Appointments by Client**
  - **Endpoint**: `GET /api/appointment/client/{clientId}`
  - Retrieves all appointments for a specific client.
  - **Response**: List of appointments for the given client ID.

---

### Nutritional Plan Management

- **Create Nutritional Plan**
  - **Endpoint**: `POST /api/nutritionalPlan/create`
  - Creates a personalized nutritional plan for a client.
  - **Request Body**:
    ```json
    {
      "clientId": "UUID",
      "nutritionistId": "UUID",
      "planDetails": "String"
    }
    ```
  - **Response**: Details of the created nutritional plan.

- **Get Nutritional Plans by Client**
  - **Endpoint**: `GET /api/nutritionalPlan/client/{clientId}`
  - Retrieves all nutritional plans associated with a specific client.
  - **Response**: List of nutritional plans for the given client ID.

---

## Architecture

### Controllers

- **AppointmentController**: Manages endpoints related to appointments and analysis requests.
- **NutritionalPlanController**: Handles nutritional plan creation and retrieval.

### Command-Query Responsibility Segregation (CQRS)

This service uses a CQRS-based approach, employing commands for creating or modifying data (`CreateAppointmentCommand`, `AddAnalysisRequestCommand`, `CreateNutritionalPlanCommand`) and queries for fetching data (`GetAppointmentsQuery`, `GetNutritionalPlanQuery`).

### Pipeline Integration

The `Pipeline` interface facilitates command and query execution, enabling a clean separation of business logic and controller layers.

---

![image](https://github.com/user-attachments/assets/0f1952c8-bc32-4c27-924d-d675e463301b)

Link to the explanation on a youtube video: https://youtu.be/NtWss1Z9Jso
