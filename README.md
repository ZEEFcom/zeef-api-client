ZEEF API Client library
=====================

This project contains the client library for the ZEEF API.

Usage
---------------------
To use the ZEEF API, you need to have an [API access token](https://zeef.io/docs/api/#api_authentication) for the user you wish to access the API as. Once you have this token, you first need to create an ApiInvoker instance and set the authorization header for this instance:

    ApiInvoker apiInvoker = new ApiInvoker();
    apiInvoker.addHeader("Authorization", "OmniLogin auth=" + apiToken);

Where apiToken is a variable that contains the API token. Please keep in mind that the ApiInvoker instances are not thread safe, but can be used for multiple requests within the same thread. The apiInvoker instance should be closed once it is no longer needed. 

You can then create an api object instance for the API endpoint you wish to use. Although the apiInvoker is not thread-safe, it can be reused for multiple api instances as long as they are used within the same thread and for the same user:

    PageApi pageApi = new PageApi(apiInvoker);
    BlockApi blockApi = new BlockApi(apiInvoker);
    
That's all there is to it, now you can start invoking calls on the ZEEF API.


### Complete example ###

    try(ApiInvoker apiInvoker = new ApiInvoker) {
        apiInvoker.addHeader("Authorization", "OmniLogin auth=" + apiToken);
        
        PagesApi pagesApi = new PagesApi(apiInvoker);
        for (PageOverview pageOverview: pagesApi.getMyPages().getPageOverviews()) {
            System.out.println(pageOverview.getUrl());
        }
    }

Maven/Gradle dependency
---------------------
To use the library as a Maven or Gradle dependency, you need to register the following (temporary) Maven repository with your project:

*Maven*

    <repository>
	    <id>zeef-api-client</id>
	    <url>https://zeefcom.github.io/repository</url>
	</repository>
	
*Gradle*

    maven {
        url "https://zeefcom.github.io/repository"
    }
    
You can then add the zeef-api-client library to your project as a dependency:

*Maven*

    <dependency>
        <groupId>com.zeef</groupId>
        <artifactId>zeef-api-client</artifactId>
        <version>2015.4</version>
    </dependency>

*Gradle*

    compile 'com.zeef:zeef-api-client:2015.4'

More information
---------------------

For more information about the ZEEF API, please see the [API documentation](https://zeef.io/docs/api/).

