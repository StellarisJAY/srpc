package com.jay.srpc.config;

import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author Jay
 * @date 2021/12/30 11:45
 */
public class RpcOption<T> {
    private String name;

    private T value;

    public RpcOption(String name, T value){
        this.name = name;
        this.value = value;
    }

    public static <T> RpcOption<T> valueOf(String name, T value){
        return new RpcOption<T>(name, value);
    }

    public String name(){
        return name;
    }
    public T value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RpcOption<?> rpcOption = (RpcOption<?>) o;
        return Objects.equals(name, rpcOption.name) && Objects.equals(value, rpcOption.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
