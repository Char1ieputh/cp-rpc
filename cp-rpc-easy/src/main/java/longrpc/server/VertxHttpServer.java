package longrpc.server;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpConnection;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.net.SSLOptions;
import io.vertx.core.net.SocketAddress;
import io.vertx.core.streams.ReadStream;

public class VertxHttpServer implements HttpServer, io.vertx.core.http.HttpServer {

    public void doStart(int port) {
        Vertx vertx = Vertx.vertx();

        io.vertx.core.http.HttpServer server =vertx.createHttpServer();

        server.requestHandler(request -> {
            System.out.println("Received request:"+request.method()+""+request.uri());
            request.response()
                    .putHeader("content-type","text/plain")
                    .end("Hello from Vert.x HTTP server");
        } );
        server.listen(port,result -> {
            if (result.succeeded()){
                System.out.println("Server is now listening on port " + port);
            }else {
                System.out.println("Failed to start server " + result.cause());
            }
        });
    }

    @Override
    public ReadStream<HttpServerRequest> requestStream() {
        return null;
    }

    @Override
    public io.vertx.core.http.HttpServer requestHandler(Handler<HttpServerRequest> handler) {
        return null;
    }

    @Override
    public Handler<HttpServerRequest> requestHandler() {
        return null;
    }

    @Override
    public io.vertx.core.http.HttpServer invalidRequestHandler(Handler<HttpServerRequest> handler) {
        return null;
    }

    @Override
    public io.vertx.core.http.HttpServer connectionHandler(Handler<HttpConnection> handler) {
        return null;
    }

    @Override
    public io.vertx.core.http.HttpServer exceptionHandler(Handler<Throwable> handler) {
        return null;
    }

    @Override
    public ReadStream<ServerWebSocket> webSocketStream() {
        return null;
    }

    @Override
    public io.vertx.core.http.HttpServer webSocketHandler(Handler<ServerWebSocket> handler) {
        return null;
    }

    @Override
    public Handler<ServerWebSocket> webSocketHandler() {
        return null;
    }

    @Override
    public Future<Boolean> updateSSLOptions(SSLOptions sslOptions, boolean b) {
        return null;
    }

    @Override
    public Future<io.vertx.core.http.HttpServer> listen() {
        return null;
    }

    @Override
    public Future<io.vertx.core.http.HttpServer> listen(SocketAddress socketAddress) {
        return null;
    }

    @Override
    public Future<Void> close() {
        return null;
    }

    @Override
    public void close(Handler<AsyncResult<Void>> handler) {

    }

    @Override
    public int actualPort() {
        return 0;
    }
}
