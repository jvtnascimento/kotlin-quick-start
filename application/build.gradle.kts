plugins {
    application
}

application {
    mainClass.set("BootKt")

    applicationDefaultJvmArgs = listOf(
        "-server",
        "-XX:+UseNUMA",
        "-XX:+UseParallelGC",
        "-Duser.timezone=UTC"
    )
}

dependencies {
    implementation(project(":web"))
    implementation(project(":usecases"))
    implementation(project(":persistence"))
}