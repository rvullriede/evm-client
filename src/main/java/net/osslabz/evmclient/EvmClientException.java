package net.osslabz.evmclient;

public class EvmClientException extends RuntimeException {

    public EvmClientException(Exception e) {
        super(e);
    }

    public EvmClientException(String message) {
        super(message);
    }
}
