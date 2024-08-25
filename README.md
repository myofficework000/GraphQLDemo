<div align="center">

<p>
	<a href="https://www.apollographql.com/"><img src="https://raw.githubusercontent.com/apollographql/apollo-client-devtools/a7147d7db5e29b28224821bf238ba8e3a2fdf904/assets/apollo-wordmark.svg" height="100" alt="Apollo Client"></a>
</p>

</div>

# GraphQL Integration in Android with Kotlin and Apollo

## Overview

This repository demonstrates how to integrate GraphQL into an Android application using Kotlin and the Apollo GraphQL client. The example app fetches country names from a GraphQL API and displays them in a RecyclerView.

## Screenshot

<img src="https://github.com/myofficework000/GraphQLDemo/blob/master/app/src/main/assets/img.png" alt="App Screenshot" />

## Learn More

For a detailed guide on integrating GraphQL into Android using Apollo, check out the [Medium article](https://medium.com/@myofficework000/graphql-in-android-using-apollo-c4d5170581d1).

## Features

- **GraphQL Integration**: Fetch only the data you need with GraphQL.
- **Apollo Client**: Efficiently handles GraphQL queries and responses.
- **Dependency Injection**: Configured with Dagger Hilt.
- **Modern UI**: Simple and responsive interface using RecyclerView.

## Setup

### 1. Add Dependencies

Update your `build.gradle.kts` (app level):

```kotlin
plugins {
    id("com.apollographql.apollo") version "version.number"
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

dependencies {
    implementation("com.apollographql.apollo:apollo-runtime:version.number")
    implementation("com.squareup.okhttp3:okhttp:version.number")
    implementation("com.squareup.okhttp3:logging-interceptor:version.number")
    implementation("com.google.dagger:hilt-android:version.number")
    kapt("com.google.dagger:hilt-compiler:version.number")
    implementation("androidx.fragment:fragment-ktx:version.number")
}




