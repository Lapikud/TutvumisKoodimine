'use strict';

// ES2015 class object
class App {
    constructor(serverUrl) {
        this.setupBinding();
        this.setupConnection(serverUrl);
    }

    setupBinding() {
        this.logEl = document.getElementById("log");
        this.sendEl = document.getElementById("send");
        this.sendEl.addEventListener("click", event => this.onSend(event))
        // more ...
    }

    setupConnection(serverUrl) {
        // https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API/Writing_WebSocket_client_applications
        this.ws = new WebSocket(serverUrl);
        this.ws.onmessage = event => this.onRecv(event);
    }

    onSend(event) {
        // Called to send a message
        var finalMessage = "Nick: Message";  // this.nicknameEl.value
        this.ws.send(finalMessage);
    }

    onRecv(event) {
        // Called when message is received
        var recvMessage = event.data
        this.logEl.value += recvMessage + "\n";
    }
}

