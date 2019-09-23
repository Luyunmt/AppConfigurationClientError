# AppConfiguration-Java-bug-whencreatclient
Failed to create ConfigurationClient by using Package  azure-data-appconfiguration 1.0.0-preview.3. Using package  Package  azure-data-appconfiguration 1.0.0-preview.2 works well

# Reproduce this issue
- clone this repository using Git first.

- git clone https://github.com/Luyunmt/AppConfigurationClientError.git

- set your  connectString in the code. 

- In Visual Studio Code, Open-Folder your project file and run...

# StackTrace & Error Message

-Exception in thread "main" java.lang.IllegalStateException: Cannot find any HttpClient provider on the classpath - unable to create a default HttpClient instance
        at com.azure.core.implementation.http.spi.HttpClientProviders.createInstance(HttpClientProviders.java:34)
        at com.azure.core.http.HttpClient.createDefault(HttpClient.java:27)
        at com.azure.core.http.HttpPipelineBuilder.build(HttpPipelineBuilder.java:61)
        at com.azure.data.appconfiguration.ConfigurationClientBuilder.buildAsyncClient(ConfigurationClientBuilder.java:173)
        at com.azure.data.appconfiguration.ConfigurationClientBuilder.buildClient(ConfigurationClientBuilder.java:118)
        at Test.main(Test.java:14)