# Chat Application

The Chat Application is a simple and lightweight desktop-based chat system implemented in Java. It enables users to communicate with each other by sending text messages and images in real-time. The application utilizes multi-threading for concurrent communication and follows software engineering methodologies for robust and maintainable code.

## Features

- Connects to a server to establish a chat session.
- Send and receive text messages in real-time.
- Send and receive images.
- Supports the selection of image files from the local file system.
- Provides a set of emojis for easy message input.
- Displays messages in a visually appealing user interface.
- Plays a notification sound when a new message is received.

## Technologies Used

The Chat Application is built using the following technologies and concepts:

- JavaFX: A framework for building desktop applications with a rich user interface.
- Socket Programming: Utilized for network communication between the client and server components.
- Java Collections Framework: Used for managing a list of emojis for easy message input.
- Multi-Threading: Implemented to handle concurrent communication between multiple clients and the server.
- File Input/Output: Reading and writing image files as byte arrays for sending and displaying images.
- Java IO: Reading image files as byte arrays.
- JFoenix: A JavaFX library providing stylized buttons and UI components.
- Java Zoom MP3 Library: Utilized for playing a notification sound when a new message is received.

## Software Engineering Methodologies

The Chat Application follows software engineering best practices to ensure maintainable and robust code. The methodologies employed include:

- Object-Oriented Programming (OOP): Designing the system using OOP principles to achieve modularity, encapsulation, and reusability.
- Model-View-Controller (MVC) Architecture: Separating the application logic, presentation, and data to enhance maintainability and code organization.
- Multi-Threading: Implementing concurrent communication between clients using multiple threads for efficient handling of connections and messages.
- Error Handling and Exception Management: Properly handling exceptions and errors to ensure the application's stability and prevent crashes.
- User Interface Design: Utilizing JavaFX and JFoenix to create an intuitive and visually appealing user interface for a pleasant user experience.

## Prerequisites

To run the Chat Application, ensure you have the following:

- Java Development Kit (JDK) 8 or above
- Java IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)
- Maven (for dependency management)

## Getting Started

To run the chat application, follow these steps:

1. Clone the repository
2. Open the project in your preferred Java IDE.
3. Build and run the server application.
4. Build and run the client application.
5. Enter your name and start chatting!

## Usage

- Enter your name in the client application and click "Connect" to join the chat session.
- Type a message in the input field and press "Send" to send a text message.
- Use the emoji buttons to insert emojis into your messages.
- Click the "Attach Image" button to select and send an image file.
- Received messages and images will be displayed in the chat window.
- To log out, click the "Logout" button.


## Roadmap

- Implement user authentication and secure communication.
- Add support for sending files other than images.
- Enhance the user interface with more styling options.
- Implement message history and persistent storage.
- Support multiple chat rooms and private messaging.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## Acknowledgements

- This project was inspired by the need for a simple and lightweight chat application.
- Thanks to the contributors and developers of the JavaFX, JFoenix, and Java Zoom MP3 Library projects for their valuable tools and libraries.
