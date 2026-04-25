plugins {
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.21"
}

val version = "[26.1.2.build,)"

dependencies {
    implementation(projects.shared) // This should not be needed explicitly but somehow it is
    implementation(projects.bukkit)
    paperweight.paperDevBundle(version)
    compileOnly("io.papermc.paper:paper-api:${version}")
}

tasks.compileJava {
    options.release.set(25)
}