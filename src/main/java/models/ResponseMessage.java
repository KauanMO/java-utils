package models;

public class ResponseMessage<T> {
    private String clientMsg;
    private String serverMsg;
    private Integer status;
    private T data;

    public ResponseMessage(String clientMsg, String serverMsg, Integer status, T data) {
        this.clientMsg = clientMsg;
        this.serverMsg = serverMsg;
        this.status = status;
        this.data = data;
    }

    public ResponseMessage(String clientMsg, Integer status) {
        this.clientMsg = clientMsg;
        this.status = status;
    }

    public ResponseMessage(String clientMsg, String serverMsg, Integer status) {
        this.clientMsg = clientMsg;
        this.serverMsg = serverMsg;
        this.status = status;
    }

    public ResponseMessage(String clientMsg, T data, Integer status) {
        this.clientMsg = clientMsg;
        this.data = data;
        this.status = status;
    }

    public ResponseMessage(T data, Integer status) {
        this.data = data;
        this.status = status;
    }

    public String getClientMsg() {
        return clientMsg;
    }

    public void setClientMsg(String clientMsg) {
        this.clientMsg = clientMsg;
    }

    public String getServerMsg() {
        return serverMsg;
    }

    public void setServerMsg(String serverMsg) {
        this.serverMsg = serverMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "clientMsg='" + clientMsg + '\'' +
                ", serverMsg='" + serverMsg + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}
