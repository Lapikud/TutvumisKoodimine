'use strict';

// ES2015 class object
class App {
    constructor(serverUrl) {
        this.setupBinding();
        // Setup more things here...
    }

    setupBinding() {
        this.sendEl = document.getElementById("send");
        this.sendEl.addEventListener("click", event => this.onSend(event))
        // more ...
    }

    setupConnection(serverUrl) {
        // https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API/Writing_WebSocket_client_applications
        // this.ws = ...;
        // this.ws.onmessage = event => this.onRecv(event);
    }

    onSend(event) {
        // Called to send a message
        var finalMessage = "Nick: Message"
        // this.ws.send
    }

    onRecv(event) {
        // Called when message is received
        var recvMessage = event.data
        // logEl.value += recvMessage;
    }
}

