# 01 Hello world - example

## Project description

The purpose of this project is to create a small example for a native Java application.

## Pre-requirements

It is recommended to use the [IDEA IntellIJ ](https://www.jetbrains.com/idea/download/?section=mac) text editor.

## Clean, build and run the project locally with JIT compilation

Please use the following instructions to clean, build and run the project:

```shell
# Clean the project
./gradlew clean

# Build the project
./gradlew assemble

# Run the project
./gradlew bootRun
```

## Native build

For native build the GraalVM or Liberica NIK library is used. Please see a detailed description about the installation of GraalVM [here](https://www.graalvm.org/latest/docs/getting-started/macos/) or about the Liberica NIK [here](<https://bell-sw.com/pages/downloads/native-image-kit/#nik-23-(jdk-17)>).

In order to build and run the project, please issue the following commands:

```sh
# Compile the project
./gradlew nativeCompile

# Compile and run the project
./gradlew nativeRun

# Run the executable from the build folder
./build/native/nativeCompile/01_hello_world

# Run the executable from the build folder with local profile
./build/native/nativeCompile/01_hello_world --spring.profiles.active=local
```
