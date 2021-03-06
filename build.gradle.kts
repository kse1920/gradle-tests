plugins {
    id("org.jetbrains.kotlin.multiplatform").version("1.3.72")
}

repositories {
    mavenLocal()
    jcenter()
}

kotlin {
    val jvm = jvm("jvm")
    val js = js {
        nodejs()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
        	dependencies {
        		implementation(kotlin("test-common"))
        		implementation(kotlin("test-annotations-common"))
        	}
        }

        val jvmMain by getting {
        	dependencies {
        		implementation(kotlin("stdlib"))
        	}
        }

        val jvmTest by getting {
        	dependencies {
        		implementation(kotlin("test-junit"))
        	}
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }

        val jsTest by getting {
        	dependencies {
        		implementation(kotlin("test-js"))
        	}
        }
    }
}