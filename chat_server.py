import socket
import threading
from textblob import TextBlob

def analyze_sentiment(message):
    analysis = TextBlob(message)
    if analysis.sentiment.polarity > 0:
        return "(Positive)"
    elif analysis.sentiment.polarity < 0:
        return "(Negative)"
    else:
        return "(Neutral)"

def handle_client(client_socket):
    while True:
        message = client_socket.recv(1024).decode("utf-8")
        if not message:
            break
        sentiment = analyze_sentiment(message)
        response = f"User: {message} {sentiment}"
        print(response)
        client_socket.send(response.encode("utf-8"))
    client_socket.close()

def start_server():
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind(("localhost", 5000))
    server.listen(5)
    print("Server is running...")
    
    while True:
        client_socket, addr = server.accept()
        print(f"Connection from {addr}")
        client_handler = threading.Thread(target=handle_client, args=(client_socket,))
        client_handler.start()

start_server()
