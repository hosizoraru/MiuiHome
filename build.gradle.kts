plugins {
    id("com.android.application") version "7.2.0-rc02" apply false
    id("com.android.library") version "7.2.0-rc02" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}