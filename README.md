**AI-Powered Chat Application with Sentiment Analysis**

## Overview
The AI-Powered Chat Application with Sentiment Analysis combines real-time messaging with machine learning to analyze and display sentiment insights. Built using Java for the chat interface and Python for sentiment processing, it enhances user engagement by providing emotional context to conversations.

## Features

💬 **Real-Time Messaging** – Enables seamless chat functionality.  
📊 **Sentiment Analysis** – Uses AI to determine message sentiment (positive, neutral, or negative).  
🔍 **Emotion Visualization** – Displays sentiment trends for better communication.  
🔄 **Multi-Language Support** – Analyzes sentiment across different languages.  
📡 **Cloud Integration** – Supports cloud-based deployment for scalability.  

## Repository Structure
```
Chat-App-Sentiment-Analysis/
│── chat_interface/        # Java-based chat system
│── sentiment_analysis/    # Python-based sentiment processing
│── database/              # Stores user messages and sentiment scores
│── scripts/               # Utility scripts for data handling
│── results/               # Logs and sentiment analysis reports
│── main.py                # Application execution file
│── requirements.txt       # Dependencies
│── README.md              # Project documentation
```

## Technologies Used

- **Programming Language:** Java (Chat Interface), Python (ML Processing)  
- **Machine Learning:** Natural Language Processing (NLTK, TextBlob, Vader)  
- **Frameworks:** Flask (Backend API), Java Swing (UI)  
- **Database:** SQLite / Firebase  

## Installation

### Prerequisites
Ensure you have the following installed:
- Java 8+
- Python 3.8+
- Required Python libraries (see requirements.txt)

### Setup
```sh
# Clone the repository
git clone https://github.com/your-username/Chat-App-Sentiment-Analysis.git

# Navigate to the project directory
cd Chat-App-Sentiment-Analysis

# Install dependencies
pip install -r requirements.txt

# Run the chat application
java -jar chat_application.jar &
python main.py
```

## Usage
1. Start the chat application  
   ```sh
   java -jar chat_application.jar &
   python main.py
   ```
2. Enter chat messages to communicate in real time.  
3. Observe sentiment analysis alongside messages.  
4. View sentiment trends through a graphical representation.  

## Contributors
- **Bhavesh Mishra (Lead Developer)**  
- **Ashutosh Pant (Sentiment Analysis & NLP Implementation)**  

## Contributing
Contributions are welcome! If you find any issues or want to improve the project, feel free to fork the repository and submit a pull request.

**Developed with ❤️ to enhance digital communication.**
