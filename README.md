# GraphQL Integration in Android with Kotlin and Apollo

## Overview

This repository demonstrates the integration of GraphQL into an Android application using Kotlin and the Apollo GraphQL client. The example app fetches country names from a GraphQL API and displays them in a RecyclerView.

## Features

- **GraphQL Integration**: Efficient data fetching using GraphQL.
- **Apollo Client**: Utilizes Apollo for GraphQL queries.
- **Dependency Injection**: Configured with Dagger Hilt.
- **Modern UI**: Displays data using RecyclerView.

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

## Implementation
Dependency Injection: Configured using Dagger Hilt.
Repository: Manages data fetching with Apollo.
ViewModel: Handles data and updates the UI.
UI: Displays data in a RecyclerView with a simple layout.

## Screenshot
![image](https://github.com/user-attachments/assets/ffc7914a-2fdf-4274-9c37-6619e1a9d273)

