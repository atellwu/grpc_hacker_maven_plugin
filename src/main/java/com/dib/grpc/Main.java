package com.dib.grpc;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

public class Main {
    public static void main(String[] args) throws Throwable {
        Class.forName("io.grpc.CallOptions");
        Class.forName("io.grpc.examples.helloworld.GreeterGrpc");
        Class.forName("io.grpc.examples.helloworld.GreeterGrpc$GreeterBlockingStub");
        return;
    }
}