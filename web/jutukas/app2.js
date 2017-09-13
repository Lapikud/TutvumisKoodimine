'use strict';

// ES2015 class object
class App {
    constructor(serverUrl) {
        this.sendEl = document.getElementById("send");
        this.sendEl.addEventListener("click", event => this.onSend(event))
        // more ...
        // https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API/Writing_WebSocket_client_applications
        // this.ws = ...;
    }

    onSend(event) {
        // Called to send a message
        var finalMessage = "Nick: Message"
    }

    onRecv(event) {
        // Called when message is received
        var recvMessage = event.data
    }
}

