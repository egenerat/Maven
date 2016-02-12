From http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

mvn --version
    Apache Maven 3.0.5 (r01de14724cdef164cd33c7c8c2fe155faf9602da; 2013-02-19 14:51:28+0100)
    Maven home: D:\apache-maven-3.0.5\bin\..
    Java version: 1.6.0_25, vendor: Sun Microsystems Inc.
    Java home: C:\Program Files\Java\jdk1.6.0_25\jre
    Default locale: nl_NL, platform encoding: Cp1252
    OS name: "windows 7", version: "6.1", arch: "amd64", family: "windows"

With CMD:
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false



[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ simple-jar ---
[INFO] Nothing to compile - all classes are up to date

First build and mvn clean install
[INFO] --- maven-compiler-plugin:3.2:compile (default-compile) @ simple-jar ---
[INFO] Changes detected - recompiling the module!



1-simple-jar


mvn archetype:generate -DgroupId=io.github.egenerat -DartifactId=simple-jar -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


to generate a jar
mvn package

Run the jar
java -cp target/simple-jar-1.0-SNAPSHOT.jar io.github.egenerat.App
Hello world!


2-simple-dependency
mvn archetype:generate -DgroupId=io.github.egenerat -DartifactId=app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=io.github.egenerat -DartifactId=app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Create with 2 different group-id
Check the difference between 2 namespaces and 2 groupId


When running your Jar with java -jar, you're no longer running with the maven resolving of dependencies. You have to make sure that all the jars you depend on are available at the relative loacation specificied in the MANIFEST.mf file in your Jar. Usually, you would use the assembly plugin to create a distributable archive that creates this structure. Or you could use a uberjar/onejar plugin to included everything inside your Jar.

5-provided-dependency-webserver
mvn archetype:generate -DgroupId=io.github.egenerat -DartifactId=webapp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

.
 |-- src
 |   `-- main
 |       `-- java
 |           |-- resources
 |           |-- webapp
 |           |   `-- WEB-INF
 |           |       `-- web.xml
 |           `-- index.jsp
  `-- pom.xml


8-reactor-modules
The following command line switches are available:

    --resume-from - resumes a reactor the specified project (e.g. when it fails in the middle)
    --also-make - build the specified projects, and any of their dependencies in the reactor
    --also-make-dependents - build the specified projects, and any that depend on them
    --fail-fast - the default behavior - whenever a module build fails, stop the overall build immediately
    --fail-at-end - if a particular module build fails, continue the rest of the reactor and report all failed modules at the end instead
    --non-recursive - do not use a reactor build, even if the current project declares modules and just build the project in the current directory

Documentation: https://maven.apache.org
